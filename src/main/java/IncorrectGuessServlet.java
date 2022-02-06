import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/incorrect")
public class IncorrectGuessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("result", "You LOSE!");
        request.setAttribute("result", false);
        request.getRequestDispatcher("/guess-number-outcome.jsp").forward(request, response);
    }
}
