<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ tag body-content="empty" %>
<%@ attribute name="category" required="true" type="au.com.sequation.sensis.model.tab.Category" %>
<%@ attribute name="location" required="true" type="au.com.sequation.sensis.web.Location"%>
<c:if test="${location.primaryId.regioned}">
    <a class="region" href='<c:url value="${location.primaryId}#" />'>View locations found <span>${location.region}</span> &gt;</a>
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
                        <a class="viewMap" href='<c:url value="${location.primaryId}#/tab/${location.findUsTabId}/contact/${contact.id}"/>'>View map</a>
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
