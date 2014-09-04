package jspproj;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/greet"})
public class Greeter extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String name = req.getParameter("name");
    if (name == null) {
      name = "World";
    }

    HttpSession session = req.getSession();

    String last = (String)session.getAttribute("last");

    session.setAttribute("last", name);

    resp.setStatus(200);
    resp.setHeader("Content-Type", "text/plain");
    resp.getWriter().println(greeting(name));
    resp.getWriter().println("Last time you asked me to greet: " + last);
  }

  public static String greeting(String name) {
    return "Hello " + name;
  }

}
