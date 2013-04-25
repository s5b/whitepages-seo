var s5b = s5b || {};

s5b.application = angular.module('application', []);

s5b.controllers = s5b.controllers || {};

s5b.controllers.main = ['$scope', '$location', function ($scope, $location) {
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

if (s5b.location.contactId) {
    document.getElementById('contact_' + s5b.location.contactId).scrollIntoView(true);
} else if (s5b.location.suburb && s5b.location.state) {
    document.getElementById('locality_' + s5b.location.suburb + '_' + s5b.location.state).scrollIntoView(true);
}