<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<c:if test="${!ajaxRequest}">
    <html>
    <head>
        <title>administration</title>
        <link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />
        <script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
    </head>
    <body>
</c:if>
<div id="formsContent">
    <h2>Administration</h2>
    <form:form id="form" method="post" modelAttribute="adminFormBean" cssClass="cleanform">
        <div class="header">
            <h2>Form</h2>
            <c:if test="${not empty message}">
                <div id="message" class="success">${message}</div>
            </c:if>
            <s:bind path="*">
                <c:if test="${status.error}">
                    <div id="message" class="error">Form has errors</div>
                </c:if>
            </s:bind>
        </div>
        <fieldset>
            <legend>Fragment XHR Response Control</legend>

            <form:label path="millisecondFragmentDelay">
                Fragment XHR Response Delay (milliseconds)
            </form:label>
            <form:input path="millisecondFragmentDelay" type="number"/>
            <form:errors path="millisecondFragmentDelay" cssClass="error" />

        </fieldset>

        <p><button type="submit">Update</button></p>
    </form:form>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#form").submit(function() {
                $.post($(this).attr("action"), $(this).serialize(), function(html) {
                    $("#formsContent").replaceWith(html);
                    $('html, body').animate({ scrollTop: $("#message").offset().top }, 500);
                });
                return false;
            });
        });
    </script>
</div>
<c:if test="${!ajaxRequest}">
    </body>
    </html>
</c:if>