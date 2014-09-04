<!DOCTYPE html>
<html>
  <%@include file="includes.jsp" %>

  <div class="container">

    <%@include file="header.jsp" %>


    <form method="POST" action="createMessage" class="form">
      <div class="form-group">
        <label>Room</label>
        <input class="form-control" type="text" name="room" />
      </div>
      <div class="form-group">
        <label>Message</label>
        <textarea class="form-control" name="message"></textarea>
      </div>

      <button class="btn btn-default" type="submit">Submit</button>
    </form>

  </div>
</html>