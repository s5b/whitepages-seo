var s5b = s5b || {};

s5b.utility = {
    parsePath: function (locationPath) {
        var pathComponents = {
            '/tab/(\\d+)':        'tabId',
            '/category/(\\d+)':   'categoryId',
            '/suburb/([^/]+)':    'suburb',
            '/state/([^/]+)':     'state',
            '/contact/([^/]+)': 'contactId'
        };
        s5b.location.contactId = '';
        s5b.location.tabId = '';
        s5b.location.categoryId = '';
        _.forEach(pathComponents, function (part, pattern) {
            var match = new RegExp(pattern).exec(locationPath);
            if (match) {
                s5b.location[part] = match[1];
            }
        });

        if (s5b.location.contactId) {
            // Having a contact id overrides all other settings.
            s5b.location.tabId = s5b.location.findUsTabId;
            // Use setTimeout with a zero interval to force delayed execution until after all other processing.
            setTimeout(function () { document.getElementById('contact_' + s5b.location.contactId).scrollIntoView(true); }, 0);
        } else if (s5b.location.tabId === '' && s5b.location.categoryId === '' && s5b.location.suburb && s5b.location.state) {
            // Have a suburb and state but no tab or category - find us for locality.
            s5b.location.tabId = s5b.location.findUsTabId;
            // Use setTimeout with a zero interval to force delayed execution until after all other processing.
            setTimeout(function () { document.getElementById('locality_' + s5b.location.suburb + '_' + s5b.location.state).scrollIntoView(true); }, 0);
        } else if (s5b.location.tabs[s5b.location.tabId]) {
            if (!_.contains(s5b.location.tabs[s5b.location.tabId], s5b.location.categoryId)) {
                s5b.location.categoryId = s5b.location.tabs[s5b.location.tabId][0];
            }
        } else {
            s5b.location.tabId = s5b.location.defaultTabId;
            s5b.location.categoryId = s5b.location.defaultCategoryId;
        }
    }
};

s5b.application = angular.module('application', []);

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
        return contactId === s5b.location.contactId ? 'selected' : '';
    };
    $scope.tabClick = function (tabId) {
        s5b.location.tabId = tabId;
    };
}];

//if (s5b.location.contactId) {
//    document.getElementById('contact_' + s5b.location.contactId).scrollIntoView(true);
//} else if (s5b.location.suburb && s5b.location.state) {
//    document.getElementById('locality_' + s5b.location.suburb + '_' + s5b.location.state).scrollIntoView(true);
//}