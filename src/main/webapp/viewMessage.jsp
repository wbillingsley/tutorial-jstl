<!DOCTYPE html>
<html>
  <%@include file="includes.jsp" %>

  <div class="container">

    <%@include file="header.jsp" %>


    <h3><%= request.getParameter("room") %></h3>

    <p>
      <textarea ><%=
          jspproj.DataStore.getInstance().getMessage(request.getParameter("room"))
      %></textarea>
    </p>

  </div>
</html>

