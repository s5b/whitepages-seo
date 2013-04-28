whitepages-seo
==============

Experiments in dynamic loading for multi-level tab with specific SEO requirements.

This project has been built using gradle. To run it ieasily you will need to install gradle.
It is using gradle version 1.5

Further, it is using SASS for the styling of the pages. So, if you plan to make changes to
the styling then it is recommended that you install SASS and have it watch for changes being
made to the *.scss files, as follows:

    cd ./src/main/web-resources/sass
    sass --watch .:../../webapp/resources/coffee-css

To run the application (webserver):

    gradle jettyRun

Then, in your browser, there are two predefined entities, coles and jetstar:

* [http://localhost:8080/whitepages-seo/business-listing/coles-supermarket-123]
* [http://localhost:8080/whitepages-seo/business-listing/coles-supermarket-123/richmond-vic]
* [http://localhost:8080/whitepages-seo/business-listing/jetstar-456]

Things To Do:
-------------

* Test in Internet Explorer 7.
* Implement the count for the location preview.
* Change the markup to be compliant with the html5 specification - change the angularjs attributes to be prefixed with "data-", for a start.
* Provide asynchronous loading of all but the default tab/category and the default content of the "Find Us" tab


