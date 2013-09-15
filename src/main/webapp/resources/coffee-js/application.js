var s5b = s5b || {};

s5b.utility = {
    makeFragmentUrl: function (tabId, categoryId, contactId) {
        return '/tab/' + tabId +
            (contactId !== undefined && contactId.length > 0 ? '/contact/' + contactId :
            (categoryId !== undefined && categoryId.length > 0 ? '/category/' + categoryId : ''));
    },
    scrollFindUs: function (id, entity, entities) {
        var element = document.getElementById(id);
        if (element !== null) {
            element.scrollIntoView(true);
        } else if (!s5b.location.near || entity !== 'locality') {
            window.alert("Oh-oh. The " + entity + " you're looking for doesn't exist. Showing all known " + entities + ".")
        }
    },
    parsePath: function (locationPath, http, compiler) {
        var fragmentUrl = '';
        var pathComponents = {
            '/tab/(\\d+)':      ['tabId'],
            '/category/(\\d+)': ['categoryId'],
            '/tab/(\\d+)/contact/([^/]+)': ['tabId', 'contactId']
        };
        s5b.location.contactId = '';
        s5b.location.tabId = '';
        s5b.location.categoryId = '';
        _.forEach(pathComponents, function (part, pattern) {
            var match = new RegExp(pattern).exec(locationPath);
            if (match) {
                for (var index = 0; index < part.length; index += 1) {
                    s5b.location[part[index]] = match[index + 1];
                }
            }
        });

        if (s5b.location.contactId) {
            // Having a contact id overrides all other settings.
            // Show the FindUs tab, and scroll to the specific contact.
            s5b.location.tabId = s5b.location.findUsTabId;
            // Use setTimeout with a zero interval to force delayed execution until after all other processing.
            setTimeout(function () { s5b.utility.scrollFindUs('contact_' + s5b.location.contactId, 'contact', 'contacts'); }, 0);
        } else if (s5b.location.tabId === '' && s5b.location.categoryId === '' && s5b.location.suburb && s5b.location.state && s5b.location.findUsTabId != 'none') {
            // Have a suburb and state but no tab or category, then show the Find Us tab for the locality.
            s5b.location.tabId = s5b.location.findUsTabId;
            // Use setTimeout with a zero interval to force delayed execution until after all other processing.
            setTimeout(function () { s5b.utility.scrollFindUs('locality_' + s5b.location.suburb + '_' + s5b.location.state, 'locality', 'localities'); }, 0);
        } else if (s5b.location.tabs[s5b.location.tabId]) {
            // Have a valid tab id.
            if (!_.contains(s5b.location.tabs[s5b.location.tabId], s5b.location.categoryId)) {
                // The category id is not valid for this tab id, so use the first category.
                // (This works because all empty tab/category combinations have been filtered out during 'ingestion'.)
                s5b.location.categoryId = s5b.location.tabs[s5b.location.tabId][0];
            }
        } else {
            // Going for the default, first tab, first category
            s5b.location.tabId = s5b.location.defaultTabId;
            s5b.location.categoryId = s5b.location.defaultCategoryId;
        }
        fragmentUrl = s5b.utility.makeFragmentUrl(s5b.location.tabId, s5b.location.categoryId, s5b.location.contactId);
        if (s5b.utility.fragments[fragmentUrl] !== undefined && !s5b.utility.fragments[fragmentUrl].loaded) {
            var elem = s5b.utility.fragments[fragmentUrl].element;
            var fragmentScope = s5b.utility.fragments[fragmentUrl].scope;
            http({ method: 'GET', url: s5b.fragment.prefix + fragmentUrl}).
                success(function (data, status, headers, config) {
                    // I don't know whether the cloning is strictly necessary but it was the easiest way to get hold of the content to replace into the DOM.
                    compiler(angular.element(data.trim()))(fragmentScope, function (clonedContent, fragmentScope) { elem.replaceWith(clonedContent); });
                    s5b.utility.fragments[fragmentUrl].loaded = true;
                    s5b.utility.parsePath(locationPath, http, compiler);
                }).
                error(function (data, status, headers, config) {
                    elem.replaceWith(data);
                });
        }
    },
    fragments: {}
};

/* *** AngularJS initialisation. */

s5b.application = angular.module('application', []);

/* *** Directives. */

s5b.application.directive('s5bContentReplacement', ['$http', '$compile', '$location', '$rootScope', '$q', function ($http, $compile, $location, $rootScope, $q) {
    return function (scope, elem, attributes) {
        s5b.utility.fragments[attributes['s5bContentReplacement']] = { loaded: false, element: elem, scope: scope };
    }
}]);

/* *** Controllers. */

s5b.application.controller('main', ['$scope', '$location', '$http', '$compile', function ($scope, $location, $http, $compile) {
    $scope.$watch(function () { return $location.path(); }, function () { s5b.utility.parsePath($location.path(), $http, $compile); });
    $scope.isTabSelected = function (tabId) {
        return tabId === s5b.location.tabId ? 'selected' : '';
    };
    $scope.isCategorySelected = function (categoryId) {
        return categoryId === s5b.location.categoryId ? 'selected' : '';
    };
    $scope.isContactSelected = function (contactId) {
        return contactId === s5b.location.contactId ? 'selected' : '';
    };
    $scope.tabClick = function (tabId) {
        s5b.location.tabId = tabId;
    };
    $scope.selectContact = function (contactId) {
        $location.path('/tab/' + s5b.location.findUsTabId + '/contact/' + contactId);
    };
}]);