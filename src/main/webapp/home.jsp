<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <%@include file="includes.jsp" %>

  <div class="container">

    <%@include file="header.jsp" %>


    <h3>Rooms</h3>
    <ul>
      <c:set var="rooms" value="<%= jspproj.DataStore.getInstance().getRooms() %>" />
      <c:forEach var="name" items="${rooms}">
        <c:url var="roomUrl" value="viewMessage.jsp">
          <c:param name="room" value="${name}" />
        </c:url>
        <li><a href="${roomUrl}">${name}</a></li>
      </c:forEach>

    </ul>

  </div>
</html>

