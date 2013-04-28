<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="s5b" %>
<%@ page session="false" %>
<!doctype html>
<html lang="en" class="ng-app:application" id="ng-app" ng-app="application" xmlns:ng="http://angularjs.org">

<head>

    <meta charset="utf-8">

    <meta name="application-name" content="CoffeePages"/>

    <meta http-equiv="imagetoolbar" content="false" />

    <link rel="stylesheet" href="<c:url value="/resources/coffee-css/coffee-pages.css" />" type="text/css" />

    <script src="<c:url value="/resources/modernizr/modernizr.custom.55386.js" />"></script>

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
    <script src="<c:url value="/resources/coffee-js/lib/json3.min.js" />"></script>
    <![endif]-->

    <script type="text/javascript">
        var s5b = s5b || {};
        s5b.location = s5b.location || {};
        s5b.location.contentName       = '${location.contentName}';
        s5b.location.contentId         = '${location.contentId}';
        s5b.location.defaultTabId      = '${location.defaultTabId}';
        s5b.location.defaultCategoryId = '${location.defaultCategoryId}';
        s5b.location.findUsTabId       = '${location.findUsTabId}';
        s5b.location.tabs              = {
            <c:set var="tabSeparator" value="" />
            <c:forEach var="tab" items="${dde.tabs}">
                ${tabSeparator}"${tab.id}": [
                        <c:set var="categorySeparator" value="" />
                        <c:forEach var="category" items="${tab.categories}">
                            ${categorySeparator}"${category.id}"
                            <c:set var="categorySeparator" value="," />
                        </c:forEach>
                ]
                <c:set var="tabSeparator" value="," />
            </c:forEach>
        };
        s5b.location.suburb      = '${location.suburb}';
        s5b.location.state       = '${location.state}';
    </script>

    <title>${dde.name} : Business Listing View</title>
    <meta name="description" content="A list of contacts explores the collision between JSP and AngularJS.">

</head>

<body ng-controller="s5b.controllers.main">

<header>
    <h1>${dde.name} : Business Listing</h1>
</header>
<article>
    <nav class="main">
        <ul><c:forEach var="tab" items="${dde.tabs}"><li><a href='<c:url value="${location.primaryId}#/tab/${tab.id}"/>' ng-class="isTabSelected('${tab.id}')">${tab.name}</a></li></c:forEach></ul>
    </nav>

    <c:forEach var="tab" items="${dde.tabs}">
        <section class="main" ng-show="isTabSelected('${tab.id}')">
            <c:choose>

                <c:when test='${tab.type == "contact"}'>
                    <nav class="categories">
                        <ul><c:forEach var="category" items="${tab.categories}"><li><a href='<c:url value="${location.primaryId}#/tab/${tab.id}/category/${category.id}"/>' ng-class="isCategorySelected('${category.id}')">${category.name}</a></li></c:forEach></ul>
                    </nav>
                    <c:forEach var="category" items="${tab.categories}">
                        <section class="contacts" ng-show="isCategorySelected('${category.id}')">
                            <c:if test="${location.primaryId.regioned}">
                                <a class="region" href='<c:url value="${location.primaryId}#" />'>View locations found in <span>${location.region}</span> &gt;</a>
                            </c:if>
                            <ul>
                                <c:forEach var="association" items="${category.associations}">
                                    <c:set var="contact"  value="${association.contact}" />
                                    <li>
                                        <div class="contact">
                                            <div class="contactBase">
                                                <div class="primaryLabel">${association.contact.label}</div>
                                                <div class="address">
                                                    <c:set var="address" value="${contact.address}" />
                                                    <p>${address.label}</p>
                                                    <p>${address.number} ${address.street}</p>
                                                    <p>${address.suburb} ${address.state} ${address.postcode}</p>
                                                </div>
                                                <c:if test="${contact.address.mappable}">
                                                    <a class="viewMap" href='<c:url value="${location.primaryId}#/contact/${contact.id}"/>'>View map</a>
                                                </c:if>
                                            </div>
                                            <div class="contactComms">
                                                <ul>
                                                    <c:forEach var="telecom" items="${contact.telecoms}">
                                                        <li>${telecom.number}</li>
                                                    </c:forEach>
                                                </ul>
                                            </div>
                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>
                        </section>
                    </c:forEach>
                    <section class="hyc">
                        <img src='<c:url value="/resources/images/hyc.png" />' alt="hyc"/>
                    </section>
                </c:when>

                <c:when test='${tab.type == "findUs"}'>
                    <div class="locationContainer">
                        <ul>
                            <c:set var="currentLocality" value="xxx-NO-MATCH-xxx" scope="request"/>
                            <c:forEach var="association" items="${tab.associations}">
                                <c:set var="contact"  value="${association.contact}" />
                                <c:set var="thisLocality" value="${contact.address.suburb}, ${contact.address.state}" />
                                <s5b:localityHeading prefix="business-listing-hash" currentLocality="${currentLocality}" thisLocality="${thisLocality}" thisSuburb="${contact.address.suburb}" thisState="${contact.address.state}" />
                                <c:set var="currentLocality" value="${thisLocality}" scope="request"/>
                                <li>
                                    <div id="contact_${contact.id}" class="contact" ng-class="isContactSelected('${contact.id}')">
                                        <div class="primaryLabel"><c:if test="${contact.address.mappable}"><img alt="poi" src="<c:url value="/resources/images/poi.png" />" /> </c:if>${contact.label}</div>
                                        <div class="address">
                                            <c:set var="address" value="${contact.address}" />
                                            <p>${address.number} ${address.street}</p>
                                            <p>${address.suburb} ${address.state} ${address.postcode}</p>
                                        </div>
                                        <div class="telecom">
                                            <ul>
                                                <c:forEach var="telecom" items="${contact.telecoms}">
                                                    <li>${telecom.number}</li>
                                                </c:forEach>
                                            </ul>
                                        </div>
                                    </div>
                                </li>
                            </c:forEach>
                        </ul>
                    </div><div class="mapContainer"><img src="<c:url value="/resources/images/mordor.png" />" class=""></div>
                </c:when>

                <c:otherwise>HUH? Tab type "${tab.type}" is unknown.</c:otherwise>

            </c:choose>
        </section>
    </c:forEach>

</article>
<footer>
    &copy; 2013 CoffeePages Pty Ltd <a href="https://github.com/s5b/whitepages-seo">(source)</a>
</footer>

<script src="<c:url value="/resources/coffee-js/lib/lodash.min.js" />"></script>
<script src="<c:url value="/resources/coffee-js/lib/angular.min.js" />"></script>
<script src="<c:url value="/resources/coffee-js/application.js" />"></script>

</body>

</html>
