<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="s5b" %>
<%@ tag body-content="empty" %>
<%@ attribute name="associations" required="true" type="java.util.List" %>
<ul>
    <c:set var="currentLocality" value="xxx-NO-MATCH-xxx" scope="request"/>
    <c:forEach var="association" items="${associations}">
        <c:set var="contact"  value="${association.contact}" />
        <c:set var="thisLocality" value="${contact.address.suburb}, ${contact.address.state}" />
        <s5b:localityHeading prefix="business-listing" currentLocality="${currentLocality}" thisLocality="${thisLocality}" thisSuburb="${contact.address.suburb}" thisState="${contact.address.state}" />
        <c:set var="currentLocality" value="${thisLocality}" scope="request"/>
        <li>
            <div id="contact_${contact.id}" class="contact" data-ng-class="isContactSelected('${contact.id}')" data-ng-click="selectContact('${contact.id}')">
                <div class="primaryLabel"><c:if test="${contact.address.mappable}"><img alt="poi" src="<c:url value="/resources/images/poi.png" />" /> </c:if>${contact.label}</div>
                <div class="address">
                    <c:set var="address" value="${contact.address}" />
                    <p>${address.number} ${address.street}</p>
                    <p>${address.suburb} ${address.state} ${address.postcode}</p>
                </div>
                <div class="link">
                    <ul>
                        <c:forEach var="link" items="${contact.links}">
                            <li><a href='<c:out value="${link.url}"/>' target="_blank">${link.label}</a></li>
                        </c:forEach>
                    </ul>
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
