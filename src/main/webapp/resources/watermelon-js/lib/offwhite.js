var app = app || {} ;

app.controller('TabController', function($scope, tabs) {

    $scope.tabs = tabs;

    $scope.activeClass = function(tab) {
        return tab === $scope.tabs.active ? "active" : ""
    };

    $scope.activate = function(tab) {
        $scope.tabs.active = tab
    }
});


app.controller('SearchController', function ($scope, $location, $http, tabs) {

    $scope.searchCriteria = {
        name: undefined,
        initial: undefined,
        location: undefined,
        tabs: tabs
    };

    $scope.searchResults = {
        data: {}, // Filled in by the ajax query
        error: ""
    };

    $scope.navigateToSearch = function() {
        var newPath = [$scope.searchCriteria.tabs.active, $scope.searchCriteria.name,
            $scope.searchCriteria.initial, $scope.searchCriteria.location].join('/');
        $location.path(newPath)
    };

    $scope.searchNow = function() {
        $scope.searchResults.searchSummary = null;

        // Short circuit
        if ($scope.searchCriteria.name == "") {
            $scope.searchCompletedSuccessfully({data: { results: [], searchSummary: {}}});
            return
        }


        var entryType = $scope.searchCriteria.tabs.active[0];
        var queryInitial = entryType === 'R';
        $http.get('/api?name=' + $scope.searchCriteria.name +
                '&entryType=' + entryType +
                '&location=' + $scope.searchCriteria.location +
                (queryInitial ? '&initial=' + $scope.searchCriteria.initial : '') +
                '&resultCount=100'
            )
            .then($scope.searchCompletedSuccessfully, $scope.searchCompletedUnsuccessfully)
    };

    $scope.searchThrottled =
        //$scope.searchNow
        _.throttle($scope.searchNow, 1000);

    $scope.searchCompletedSuccessfully = function(data, status, headers, config) {
        $scope.searchResults.error = "";

        if (data.error) {
            $scope.searchCompletedUnsuccessfully(data.error, status, headers, config)
        } else {
            $scope.searchResults.data = data.data
        }
    };

    $scope.searchCompletedUnsuccessfully = function(data, status, headers, config) {
        $scope.error = "Sorry, search isn't working right now."
    };

    $scope.summariseSearch = function() {
        var searchSummary = $scope.searchResults.data.searchSummary;

        if (searchSummary == null) return "Searching...";

        return [$scope.resultsCountSummary($scope.searchResults.data.results, searchSummary),
            $scope.summariseFor(searchSummary),
            $scope.summariseLocation(searchSummary)].join(" ")
    };

    $scope.summariseLocation = function(searchSummary) {
        if (searchSummary.locality == "EMPTY LOCALITY" || !searchSummary.locality) {
            return "";
        } else {
            return " in " + searchSummary.locality + " " + searchSummary.state
        }
    };

    $scope.summariseFor = function(searchSummary) {
        return (searchSummary.subscriberName ==null ? "": " for " + searchSummary.subscriberName)
    };

    $scope.resultsCountSummary = function(results, searchSummary) {
        if (results.length == 0) {
            return "No results found"
        }

        if (results.length == searchSummary.totalHits) {
            if (results.length == 1) {
                return "1 result found"
            } else {
                return results.length + " results found"
            }
        } else {
            return results.length + " of " + searchSummary.totalHits + " results"
        }
    };

    $scope.digestPath = function(path) {
        var segs = path.split('/');

        $scope.searchCriteria.tabs.active = (segs[1] || 'Business');
        $scope.searchCriteria.name = segs[2] || '';
        $scope.searchCriteria.initial =  segs[3] || '';
        $scope.searchCriteria.location = segs[4] || '';

        if (path !== "") {
            $scope.searchThrottled()
        }
    };

    $scope.$watch('searchCriteria.tabs.active', $scope.navigateToSearch);
    $scope.$watch('searchCriteria.name',        $scope.navigateToSearch);
    $scope.$watch('searchCriteria.initial',     $scope.navigateToSearch);
    $scope.$watch('searchCriteria.location',    $scope.navigateToSearch);

    $scope.$watch(function() { return $location.path() }, function(to, from){
        $scope.digestPath($location.path())
    });

    $scope.digestPath($location.path())
});