var s5b = s5b || {};

s5b.utility = {
};

/* *** AngularJS initialisation. */

s5b.application = angular.module('application', []);

/* *** Configuration. */

s5b.application.config(['$locationProvider', function ($locationProvider) {
    $locationProvider.html5Mode(false);
}]);

/* *** Services. */

s5b.application.service('viewState', ['$http', '$compile', function ($http, $compile) {
    var fragmentPrefix = '';
    var fragments = {};
    var viewState = {
        contentName: '',
        contentId: '',
        defaultTabId: '',
        defaultCategoryId: '',
        contactId: '',
        tabId: '',
        categoryId: '',
        findUsTabId: '',
        suburb: '',
        state: '',
        near: '',
        tabs: []
    };
    var makeFragmentUrl = function (tabId, categoryId, contactId) {
        return '/tab/' + tabId +
            (contactId !== undefined && contactId.length > 0 ? '/contact/' + contactId :
                (categoryId !== undefined && categoryId.length > 0 ? '/category/' + categoryId : ''));
    };
    var scrollFindUs = function (id, entity, entities) {
        var element = document.getElementById(id);
        if (element !== null) {
            element.scrollIntoView(true);
        } else if (!viewState.near || entity !== 'locality') {
            window.alert("Oh-oh. The " + entity + " you're looking for doesn't exist. Showing all known " + entities + ".")
        }
    };

    var service = {
        setFragmentPrefix: function (fragmentPrefixValue) {
            fragmentPrefix = fragmentPrefixValue;
        },
        setContentName : function (contentName) {
            viewState.contentName = contentName;
        },
        setContentId : function (contentId) {
            viewState.contentId = contentId;
        },
        setFragment : function (fragmentId, fragmentValue) {
            fragments[fragmentId] = fragmentValue;
        },
        setTabId: function (tabId) {
            viewState.tabId = tabId;
        },
        getTabId: function () {
            return viewState.tabId;
        },
        getCategoryId: function () {
            return viewState.categoryId;
        },
        setFindUsTabId: function (findUsTabId) {
            viewState.findUsTabId = findUsTabId;
        },
        getFindUsTabId: function () {
            return viewState.findUsTabId;
        },
        setDefaultTabId: function (defaultTabId) {
            viewState.defaultTabId = defaultTabId;
        },
        setDefaultCategoryId: function (defaultCategoryId) {
            viewState.defaultCategoryId = defaultCategoryId;
        },
        getContactId: function () {
            return viewState.contactId;
        },
        setSuburb: function (suburb) {
            viewState.suburb = suburb;
        },
        setState: function (state) {
            viewState.state = state;
        },
        setNear: function (near) {
            viewState.near = near;
        },
        setTabs: function (tabs) {
            viewState.tabs = tabs;
        },
        parsePath: function (locationPath) {
            var fragmentUrl = '';
            var pathComponents = {
                '/tab/(\\d+)':      ['tabId'],
                '/category/(\\d+)': ['categoryId'],
                '/tab/(\\d+)/contact/([^/]+)': ['tabId', 'contactId']
            };
            viewState.contactId = '';
            viewState.tabId = '';
            viewState.categoryId = '';
            _.forEach(pathComponents, function (part, pattern) {
                var match = new RegExp(pattern).exec(locationPath);
                if (match) {
                    for (var index = 0; index < part.length; index += 1) {
                        viewState[part[index]] = match[index + 1];
                    }
                }
            });

            if (viewState.contactId) {
                // Having a contact id overrides all other settings.
                // Show the FindUs tab, and scroll to the specific contact.
                viewState.tabId = viewState.findUsTabId;
                // Use setTimeout with a zero interval to force delayed execution until after all other processing.
                setTimeout(function () { scrollFindUs('contact_' + viewState.contactId, 'contact', 'contacts'); }, 0);
            } else if (viewState.tabId === '' && viewState.categoryId === '' && viewState.suburb && viewState.state && viewState.findUsTabId != 'none') {
                // Have a suburb and state but no tab or category, then show the Find Us tab for the locality.
                viewState.tabId = viewState.findUsTabId;
                // Use setTimeout with a zero interval to force delayed execution until after all other processing.
                setTimeout(function () { scrollFindUs('locality_' + viewState.suburb + '_' + viewState.state, 'locality', 'localities'); }, 0);
            } else if (viewState.tabs[viewState.tabId]) {
                // Have a valid tab id.
                if (!_.contains(viewState.tabs[viewState.tabId], viewState.categoryId)) {
                    // The category id is not valid for this tab id, so use the first category.
                    // (This works because all empty tab/category combinations have been filtered out during 'ingestion'.)
                    viewState.categoryId = viewState.tabs[viewState.tabId][0];
                }
            } else {
                // Going for the default, first tab, first category
                viewState.tabId = viewState.defaultTabId;
                viewState.categoryId = viewState.defaultCategoryId;
            }
            fragmentUrl = makeFragmentUrl(viewState.tabId, viewState.categoryId, viewState.contactId);
            if (fragments[fragmentUrl] !== undefined && !fragments[fragmentUrl].loaded) {
                var elem = fragments[fragmentUrl].element;
                var fragmentScope = fragments[fragmentUrl].scope;
                $http({ method: 'GET', url: fragmentPrefix + fragmentUrl}).
                    success(function (data) {
                        // I don't know whether the cloning is strictly necessary but it was the easiest way to get hold of the content to replace into the DOM.
                        $compile(angular.element(data.trim()))(fragmentScope, function (clonedContent) { elem.replaceWith(clonedContent); });
                        fragments[fragmentUrl].loaded = true;
                        service.parsePath(locationPath);
                    }).
                    error(function (data) {
                        elem.replaceWith(data);
                    });
            }
        }
    };
    return service;
}]);

s5b.application.service('locationMap', [function () {
    var map = undefined;
    var pois = {};

    var layerStyle = OpenLayers.Util.extend({}, OpenLayers.Feature.Vector.style['default']);
    layerStyle.fillOpacity = 0.2;
    layerStyle.graphicOpacity = 1;

    var featureListeners = {
        featureclick: function (event) {
            console.log("In the feature event click listener. " + event.feature.id);
            return false;
        }
    };

    var poiGraphic = OpenLayers.Util.extend({}, layerStyle);
    poiGraphic.strokeColor = "blue";
    poiGraphic.fillColor = "blue";
    poiGraphic.graphicName = "star";
    poiGraphic.pointRadius = 10;
    poiGraphic.strokeWidth = 3;
    poiGraphic.rotation = 45;
    poiGraphic.strokeLinecap = "butt";

    var featureLayer = new OpenLayers.Layer.Vector("Simple Geometry", { style: layerStyle, eventListeners: featureListeners });

    var projection = new OpenLayers.Projection('EPSG:4326');

    var addPoiToMap = function (poi) {
        var point = new OpenLayers.Geometry.Point(poi.long, poi.lat).transform(projection, map.getProjectionObject());
        poi.feature = new OpenLayers.Feature.Vector(point, null, poiGraphic);
        featureLayer.addFeatures([poi.feature]);
    };

    return {
        createMap: function (id) {
            map = new OpenLayers.Map({
                div: id,
                layers: [new OpenLayers.Layer.OSM(), featureLayer],
                controls: [
                    new OpenLayers.Control.Navigation({
                        dragPanOptions: {
                            enableKinetic: true
                        }
                    }),
                    new OpenLayers.Control.Attribution(),
                    new OpenLayers.Control.Zoom()
                ],
                allOverlays: true,
                eventListeners: {
                    featureover: function (event) {
                        console.log("Over...");
                    },
                    featureclick: function (event) {
                        console.log("Map says: " + e.feature.id + " clicked on " + e.feature.layer.name);
                    }
                }
            });

            // TODO: This is temporary centre and zoom, and should be set by the viewState.
            map.setCenter(new OpenLayers.LonLat(115.8589, -31.9522).transform(projection, map.getProjectionObject()),12);
//            map.addLayer(featureLayer);
            for (var poi in pois) {
                if (pois.hasOwnProperty(poi)) {
                    console.log("A Adding POI");
                    addPoiToMap(pois[poi]);
                }
            }
        },
        addPoi: function (id, element, longitude, latitude) {
            if (pois[id] === undefined) {
                var poi = { id: id, element: element, lat: latitude, long: longitude };
                pois[id] = poi;
                if (map !== undefined) {
                    console.log("Adding POI");
                    addPoiToMap(poi);
                }
            }
        }
    };
}]);

/* *** Directives. */

s5b.application.directive('s5bContentReplacement', ['viewState', function (viewState) {
    return function (scope, elem, attributes) {
        viewState.setFragment(attributes['s5bContentReplacement'], { loaded: false, element: elem, scope: scope });
    };
}]);

s5b.application.directive('s5bLocationMap', ['locationMap', function (locationMap) {
    return {
        link: function (scope, elem) {
            locationMap.createMap(elem[0]);
        }
    };
}]);

s5b.application.directive('s5bMapReference', ['locationMap', function (locationMap) {
    var latLongPattern = new RegExp('^\\s*([^\\s]+)\\s*,\\s*([^\\s]+)\\s*$');
    return {
        link: function (scope, elem, attributes) {
            var match = latLongPattern.exec(attributes['s5bMapReference']);
            if (match) {
                locationMap.addPoi(attributes['id'], elem, parseFloat(match[1]), parseFloat(match[2]));
            }
        }
    };
}]);

/* *** Controllers. */

s5b.application.controller('main', ['$scope', '$location', 'viewState', function ($scope, $location, viewState) {
    $scope.$watch(function () { return $location.path(); }, function () { viewState.parsePath($location.path()); });
    $scope.isTabSelected = function (tabId) {
        return tabId === viewState.getTabId() ? 'selected' : '';
    };
    $scope.isCategorySelected = function (categoryId) {
        return categoryId === viewState.getCategoryId() ? 'selected' : '';
    };
    $scope.isContactSelected = function (contactId) {
        return contactId === viewState.getContactId() ? 'selected' : '';
    };
    $scope.tabClick = function (tabId) {
        viewState.setTabId(tabId);
    };
    $scope.selectContact = function (contactId) {
        $location.path('/tab/' + viewState.getFindUsTabId() + '/contact/' + contactId);
    };
}]);