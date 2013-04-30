<%--
  Created by IntelliJ IDEA.
  User: sbegg
  Date: 29/04/13
  Time: 5:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Not Found: ${contentName}-${contentId}</title>
    <style type="text/css">
        body {
            padding: 3em;
            font-family: sans-serif;
            background-image: url(<c:url value="/resources/images/bomb.png"/>);
            background-repeat: no-repeat;
            color: #663300;
        }
    </style>
</head>
<body>
    <h1>Not Found</h1>
    <p>There are no <em>Digital Display Entries</em> for the URL you provided: <code>${baseUrlPrefix}${contentName}-${contentId}</code></p>
    <p>Try one of the following URLs:</p>
    <ul>
        <c:forEach var="contentIdentifier" items="${ddes}">
            <li><a href='<c:url value="${baseUrlPrefix}${contentIdentifier}"/>'>${contentIdentifier}</a></li>
        </c:forEach>
    </ul>
</body>
</html>