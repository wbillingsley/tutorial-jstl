package jspproj;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * This servlet receives messages that we post
 */
@WebServlet(urlPatterns = {"/createMessage"})
public class PostMessageServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // get the room
        String room = request.getParameter("room");

        // get the message
        String message = request.getParameter("message");

        // store the message for that room
        DataStore.getInstance().putMessage(room, message);

        RequestDispatcher rd = request.getRequestDispatcher("viewMessage.jsp");
        rd.forward(request, response);

    }


}
