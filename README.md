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
