package bacit.web.bacit_web;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Just a test</h1>");
        out.println("<h1>Input stuff</h1>");
        out.println("<form action='FirstServlet' method='POST'>");
        out.println("  <label for='input1'>First Input</label>");
        out.println("  <input type='text' name='input1'/>");
        out.println("  <input type='submit' />");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String input1 = request.getParameter("input1");
        response.setContentType("text/plain");
        response.getWriter().print(input1);
    }
}
