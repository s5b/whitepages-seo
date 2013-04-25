/* application.js */

/* URL schemes

    #/:firstId
        - For a contacts tab, displays the specified tab with the first (or default) category;
        - For a find-us tab, displays all contacts, with all location sets deselected.
    #/:firstId/:secondId
        - For a contacts tab, displays the specified tab (:firstId) with the specified category (:secondId) selected;
        - For a find-us tab, displays the specified tab (:firstId) with the specified contact (:secondId) highlighted, and all contacts in the same suburb.
    #/:suburb-:state
        - Shows find-us tab zoomed to the suburb and state.
    #/:postcode
        - Is this required? Indistinguishable from the first pattern (#/firstId) above, anyway.


 */

var s5b = s5b || {};

s5b.controllers = {};

s5b.location = {
    firstId: '',
    secondId: '',
    suburbName: '',
    stateAbbrev: ''
};

s5b.template = '/contacts.html';

s5b.utility = {
    setLocation: function (first, second, suburb, state) {
        console.log(' --- first: ' + first);
        console.log(' --- second: ' + second);
        s5b.location.firstId = first;
        if (second || !(first)) {
            s5b.location.secondId = second;
        } else {
            console.log(s5b.utility.selectedTab());
            if (s5b.utility.selectedTab().type === 'contacts') {
                s5b.location.secondId = s5b.utility.selectedTab().categories[0].id;
            } else {
                s5b.location.secondId = '';
            }
        }
        s5b.location.suburbName = suburb;
        s5b.location.stateAbbrev = state;
    },
    digestPath: function (path) {
        console.log(path);
        var result;
        result = new RegExp('^\\s*$').exec(path);
        if (result) {
            /* The first tab is always a contacts tab, with at least one category. */
            s5b.utility.setLocation(s5b.navigation[0].id, s5b.navigation[0].categories[0].id, '', '');
        } else {
            result = new RegExp('^/(\\d+)$').exec(path);
            if (result) {
                s5b.utility.setLocation(result[1], '', '', '');
            } else {
                result = new RegExp('^/(\\d+)/(\\d+)$').exec(path);
                if (result) {
                    s5b.utility.setLocation(result[1], result[2], '', '');
                } else {
                    result = new RegExp('^/(.+)-([^-]+)$').exec(path);
                    if (result) {
                        /* FIXME: The second tab is not necessarily the first find-us tab. */
                        s5b.utility.setLocation(s5b.navigation[1].id, '', result[1].toLowerCase(), result[2].toLowerCase());
                    } else {
                        /* Unknown URL: What to do? */
                        s5b.utility.setLocation(s5b.navigation[0].id, s5b.navigation[0].categories[0].id, '', '');
                    }
                }
            }
        }
        s5b.template = '/' + s5b.utility.selectedTab().type + '.html';
        console.log('-- first: ' + s5b.location.firstId);
        console.log('-- second: ' + s5b.location.secondId);
        console.log('-- suburb: ' + s5b.location.suburbName);
        console.log('-- state: ' + s5b.location.stateAbbrev);
        console.log('-- template: ' + s5b.template);

    },
    selectedTabId: function () {
        return s5b.location.firstId || s5b.navigation[0].id;
    },
    selectedTab: function () {
        var currentTabId = s5b.location.firstId;
        return _.find(s5b.navigation, { id: currentTabId });
    },
    selectedCategoryId: function () {
//        return s5b.location.secondId || s5b.utility.selectedTab().categories[0].id;
        return s5b.location.secondId;
    },
    selectedCategory: function () {
        return _.find(s5b.utility.selectedTab().categories, { id: s5b.utility.selectedCategoryId() });
    }
};


/* *** Main *** */

s5b.controllers.main = function ($scope, $location) {
    $scope.tabs = s5b.navigation;

    $scope.isSelected = function (thisTabId) {
        return thisTabId === s5b.location.firstId ? 'selected' : '';
    };

    $scope.$watch(function() { return $location.path() }, function(to, from){
        s5b.utility.digestPath($location.path())
    });
    $scope.includeTemplate = function () {
//        var template = '/' + s5b.utility.selectedTab().type + '.html';
        console.log('Template: ' + s5b.template);
        return s5b.template;
    }
};

/* *** Contacts *** */

s5b.controllers.contacts = function ($scope, $location) {
    $scope.$location = $location;

    $scope.currentTab = function () {
        return s5b.utility.selectedTabId();
    };
    $scope.isSelected = function (thisCategoryId) {
        return thisCategoryId === s5b.location.secondId ? 'selected' : '';
    };
    $scope.categories = function () {
        return s5b.utility.selectedTab().categories;
    };
    $scope.contacts = function () {
        var currentCategory = s5b.utility.selectedCategory();
        return currentCategory === undefined ? [] : _.map(currentCategory.contacts, function(id) { return s5b.contacts['id' + id] });
    };
    $scope.mappable = function (contact) {
        return contact.address.geolocation !== undefined;
    };
};

/* *** Find Us *** */

s5b.controllers.findUs = function ($scope, $location) {
    $scope.$location = $location;
    $scope.contacts = function () {
        var targetContact;
        var filterFunc = function (c) { return true; };
        if (s5b.location.secondId && s5b.location.suburbName === '' && s5b.location.stateAbbrev === '') {
            targetContact = s5b.contacts['id' + s5b.location.secondId];
            filterFunc = function (c) {
                console.log('Contact suburb: ' + c.address.suburb.toLowerCase());
                console.log('Contact state: ' + c.address.state.toLowerCase());
                return targetContact.address.state.toLowerCase() === c.address.state.toLowerCase() &&
                    targetContact.address.suburb.toLowerCase() === c.address.suburb.toLowerCase();
            };
        } else if (s5b.location.suburbName !== '' && s5b.location.stateAbbrev !== '') {
            filterFunc = function (c) {
                return s5b.location.stateAbbrev.toLowerCase() === c.address.state.toLowerCase() &&
                    s5b.location.suburbName === c.address.suburb.toLowerCase().replace(/\s+/g, '-');
            }
        }
        return _.sortBy(
            _.filter(
                _.map(
                    s5b.contacts,
                    function(c) { return c; }),
                filterFunc),
            function (c) { return c.address.suburb; });
    };
    $scope.openingHours = function (contact) {
        return contact.openingHours;
    };
    $scope.isSelected = function (contact) {
        return ('' + contact.id) === s5b.location.secondId ? 'selected' : '';
    };
};

/* *** Setup *** */

s5b.application = angular.module('pink', []);
/*
s5b.application = angular.module('pink', [], function($routeProvider, $locationProvider) {
    $routeProvider.when('/contacts/:tabId', {
        templateUrl: '/views/contacts.html',
        controller: s5b.controllers.contacts
    });
    $routeProvider.when('/contacts/:tabId/category/:categoryId', {
        templateUrl: '/views/contacts.html',
        controller: s5b.controllers.contacts
    });
    $routeProvider.when('/findus/:tabId', {
        templateUrl: '/views/findUs.html',
        controller: s5b.controllers.findUs
    });
//    $routeProvider.when('/:suburb-:state', {
//        templateUrl: '/seo-a-go-go/views/findUs.html',
//        controller: s5b.controllers.findUs
//    });
    $routeProvider.when('/findus/:tabId/contact/:contactId', {
        templateUrl: '/views/findUs.html',
        controller: s5b.controllers.findUs
    });
    $routeProvider.when('/webapp/views/contacts', {
        templateUrl: '/views/contacts.html',
        controller: s5b.controllers.contacts
    });
    $routeProvider.otherwise({ redirectTo: '/contacts/1'});
    $locationProvider.html5Mode(true);
});
    */