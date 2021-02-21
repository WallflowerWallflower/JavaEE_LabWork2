
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("registration.jsp").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {


            String username = req.getParameter("username");
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String status = "registration";

            req.setAttribute("username", username);
            req.setAttribute("password", password);
            req.setAttribute("email", email);
            req.setAttribute("status", status);
            System.out.println("You Have Successfully Registered !");
            RequestDispatcher rd = req.getRequestDispatcher("main.jsp");
            rd.forward(req, resp);
        }
        }


