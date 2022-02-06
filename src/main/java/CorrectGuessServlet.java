import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/correct")
public class CorrectGuessServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    request.setAttribute("result", "You guessed the number right. You WIN!"); //can do as well

    request.getParameter("guessedNum");
    request.setAttribute("result", true);
    request.getRequestDispatcher("/guess-number-outcome.jsp").forward(request, response);
    }
}
