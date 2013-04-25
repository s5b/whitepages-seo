<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!doctype html>
<html lang="en" class="ng-app:pink" id="ng-app" ng-app="pink" xmlns:ng="http://angularjs.org">

<head>

    <meta charset="utf-8">

    <meta name="application-name" content="A List of Contacts"/>

    <meta http-equiv="imagetoolbar" content="false" />

    <link rel="stylesheet" href="resources/watermelon-pages.css" />

    <!--<script src="/d/_/js/libs/modernizr-custom.js"></script>-->

    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <!--[if lte IE 8]>
    <script>
        document.createElement('ng-include');
        document.createElement('ng-pluralize');
        document.createElement('ng-view');
        document.createElement('ng:include');
        document.createElement('ng:pluralize');
        document.createElement('ng:view');
    </script>
    <![endif]-->
    <!--[if lt IE 8]>
    <script src="resources/watermelon-js/lib/json3.min.js"></script>
    <![endif]-->



    <title>A List of Contacts</title>
    <meta name="description" content="A list of contacts explores the collision between JSP and AngularJS.">

</head>

<body ng-controller="s5b.controllers.main">

    <header>
        <h1>WatermelonPages - for all things pink-ish.</h1>
    </header>
    <article>
        <nav class="main">
            <ul>
                <li ng-repeat="tab in tabs"><a ng-href="#/{{tab.id}}" ng-class="isSelected(tab.id)">{{tab.name}}</a></li>
            </ul>
        </nav>

        <script type="text/ng-template" id="/contacts.html">
            <div ng-controller="s5b.controllers.contacts">
                <nav class="categories">
                    <ul>
                        <li ng-repeat="category in categories()"><a ng-href="#/{{currentTab()}}/{{category.id}}" ng-class="isSelected(category.id)">{{category.name}}</a></li>
                    </ul>
                </nav>
                <section class="contacts">
                    <ul>
                        <li ng-repeat="contact in contacts()">
                            <div class="contact">
                                <div class="primaryLabel">{{contact.primaryLabel}}</div>
                                <div class="address">
                                    <p>{{contact.address.number}} {{contact.address.street}}</p>
                                    <p>{{contact.address.suburb}} {{contact.address.state}} {{contact.address.postcode}}</p>
                                </div>
                                <a class="viewMap" href="#/2/{{contact.id}}" ng-show="mappable(contact)">View map</a>
                            </div>
                        </li>
                    </ul>
                </section>
            </div>
        </script>

        <script type="text/ng-template" id="/findus.html">
            <div ng-controller="s5b.controllers.findUs">
                <div class="locationContainer">
                    <ul>
                        <li ng-repeat="contact in contacts()">
                            <div class="contact" ng-class="isSelected(contact)">
                                <div class="primaryLabel"><img src="http://localhost:8080/watermelon-pages/resources/images/poi.png" ng-show="contact.address.geolocation" /> {{contact.primaryLabel}}</div>
                                <div class="address">
                                    <p>{{contact.address.number}} {{contact.address.street}}</p>
                                    <p>{{contact.address.suburb}} {{contact.address.state}} {{contact.address.postcode}}</p>
                                </div>
                                <div class="openingHours">
                                    <h6>Opening Hours</h6>
                                    <ul>
                                        <li ng-repeat="hours in openingHours(contact)">
                                            <p>{{hours.days}} : {{hours.hours}}</p>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="mapContainer"><img src="resources/images/30th-map.jpg" class=""></div>
            </div>
        </script>

        <section class="main" ng-include="includeTemplate()">Huh?</section>

    </article>
    <footer>
        &copy; 2013 WatermelonPages Pty Ltd
    </footer>

    <script src="resources/watermelon-js/lib/lodash.min.js"></script>
    <script src="resources/watermelon-js/lib/angular.min.js"></script>
    <script src="resources/watermelon-js/navigation.js"></script>
    <script src="resources/watermelon-js/contacts.js"></script>
    <script src="resources/watermelon-js/application.js"></script>

</body>

</html>
