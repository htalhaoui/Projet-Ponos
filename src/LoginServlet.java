import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Hassan on 27/04/2016.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final String userID = "abc";
    private final String password = "123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        ServletOutputStream out = response.getOutputStream();
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        System.out.println("user = " + user + " pwd = " + pwd);
        response.setContentType("text/plain");
        if(user.equals(userID) && pwd.equals(password)) {
            out.println("<HTML>");
            out.println("<HEAD><TITLE>Our First Servlet</TITLE></HEAD>");
            out.println("<BODY>");
            out.println("<TABLE>");
            out.println("<A href=\"espace.html\">Espace</A>");
            out.println("</TABLE></BODY></HTML>");
            //HttpResponse.sendRedirect("Location: espace.html");

        } else {
            out.println("Le login et/ou le mot de passe sont incorrects");
        }
    }
}
