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

* Implement the count for the location preview.
* Provide asynchronous loading of all but the default tab/category and the default content of the "Find Us" tab

Continuous tasks (have been done but need to be redone continually):

* Test in Internet Explorer 7.
* Check that the markup is valid.


