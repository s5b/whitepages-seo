<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ tag body-content="empty" %>
<%@ attribute name="prefix" required="true" %>
<%@ attribute name="currentLocality" required="true" %>
<%@ attribute name="thisLocality" required="true" %>
<%@ attribute name="thisSuburb" required="true" %>
<%@ attribute name="thisState" required="true" %>
<c:if test="${!fn:containsIgnoreCase(currentLocality, thisLocality)}">
    <c:set var="paramSuburb" value='${fn:toLowerCase(fn:replace(thisSuburb, " ", "-"))}' />
    <c:set var="paramState" value='${fn:toLowerCase(thisState)}' />
    <a id='locality_${paramSuburb}_${paramState}' class="locality" href='<c:url value="/${prefix}/${contentName}-${contentId}/${paramSuburb}-${paramState}"/>'>${thisLocality}</a>
</c:if>