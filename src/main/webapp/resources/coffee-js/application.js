var s5b = s5b || {};

s5b.utility = {
    scrollFindUs: function (id, entity, entities) {
        var element = document.getElementById(id);
        if (element !== null) {
            element.scrollIntoView(true);
        } else {
            if (!s5b.location.near || entity !== 'locality') {
                window.alert("Oh-oh. The " + entity + " you're looking for doesn't exist. Showing all known " + entities + ".")
            }
        }
    },
    parsePath: function (locationPath) {
        console.log("parsing the location.");
        var pathComponents = {
            '/tab/(\\d+)':      ['tabId'],
            '/category/(\\d+)': ['categoryId'],
            '/contact/([^/]+)': ['contactId']
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
            // FIXME: Need to change this into a promise to scroll to the selected contact once the Find Us tab has been resolved. (Same below for the other scroll)
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
    }
};

s5b.application = angular.module('application', []);

s5b.application.directive('s5bContentReplacement', ['$http', '$compile', '$location', '$rootScope', '$q', function ($http, $compile, $location, $rootScope, $q) {
    return function (scope, elem, attributes) {
        console.log("--Requesting " + attributes['s5bContentReplacement']);
        $http({ method: 'GET', url: s5b.fragment.prefix + attributes['s5bContentReplacement']}).
            success(function (data, status, headers, config) {
                // I don't know whether the cloning is strictly necessary but it was the easiest way to get hold of the content to replace into the DOM.
                $compile(angular.element(data.trim()))(scope, function (clonedContent, scope) { elem.replaceWith(clonedContent); });
                s5b.utility.parsePath($location.path);
            }).
            error(function (data, status, headers, config) {
                elem.replaceWith(data);
            });
    }
}]);

s5b.controllers = s5b.controllers || {};

s5b.controllers.main = ['$scope', '$location', function ($scope, $location) {
    $scope.$watch(function () { return $location.path(); }, function () { s5b.utility.parsePath($location.path()); });
    $scope.isTabSelected = function (tabId) {
        return tabId === s5b.location.tabId ? 'selected' : '';
    };
    $scope.isCategorySelected = function (categoryId) {
        return categoryId === s5b.location.categoryId ? 'selected' : '';
    };
    $scope.isContactSelected = function (contactId) {
//        console.log($scope);
//        console.log('Selection: target: ' + s5b.location.contactId + ', this: ' + contactId + ', selected? ' + (contactId === s5b.location.contactId ? 'YES' : '--'));
        return contactId === s5b.location.contactId ? 'selected' : '';
    };
    $scope.tabClick = function (tabId) {
        s5b.location.tabId = tabId;
    };
    $scope.selectContact = function (contactId) {
//        console.log(contactId);
//        console.log($location);
        $location.path('/contact/' + contactId);
    };
}];