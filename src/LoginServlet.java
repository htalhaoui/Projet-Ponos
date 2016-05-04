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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {
        ServletOutputStream out = response.getOutputStream();
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        System.out.println("user = " + user + " pwd = " + pwd);
        response.setContentType("text/plain");
        if(user.equals(userID) && pwd.equals(password)) {
            HttpResponse.sendRedirect("Location: espace.html");

        } else {
            out.println("Le login et/ou le mot de passe sont incorrects");
        }
    }
}
