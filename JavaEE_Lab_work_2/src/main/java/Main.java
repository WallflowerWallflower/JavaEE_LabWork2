import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {
    public Main() {
    }
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            if ((String)req.getAttribute("status") == null || ((String)req.getAttribute("status")).equals("false")) {
                req.getRequestDispatcher("login.jsp").forward(req, resp);
            } else {
                req.getRequestDispatcher("main.jsp").forward(req, resp);
            }
        }
}
