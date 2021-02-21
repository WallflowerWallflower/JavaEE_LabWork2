
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
    public Login() {
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {


            String username = req.getParameter("username");
            String password = req.getParameter("password");
            String status = "false";
            ServletConfig config = getServletConfig();
            Enumeration<String> elements = config.getInitParameterNames();

        while (elements.hasMoreElements()) {
            String elementUsername = elements.nextElement();
            String elementPassword = config.getInitParameter(elementUsername);

            if (elementUsername.equals(username) && elementPassword.equals(password)) {
                status = "true";
                break;
            }
        }

        req.setAttribute("status", status);

        if (status.equals("true")) {
            req.setAttribute("username", username);
            req.setAttribute("password", password);
            System.out.println("GO MAIN PAGE");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
            System.out.println("GO LOGIN PAGE");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }



    }
