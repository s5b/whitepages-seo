<%@ tag body-content="empty" %>
<jsp:useBean id="today" scope="page" class="java.util.Date"/>
Today's date is: ${today.date} / ${today.month} / ${today.year + 1900}