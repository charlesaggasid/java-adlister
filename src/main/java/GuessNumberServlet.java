import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessNumberServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess-number.jsp").forward(request, response);
    }
    @Override //doPost codes are connected to guess-number.jsp
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int randomNumber = random.nextInt(3-1) + 1;
        System.out.println("Random is " + randomNumber);

        String guessedNum = request.getParameter("guessedNum");
        System.out.println("Guessed num is " + guessedNum);

        if (Integer.parseInt(guessedNum) == randomNumber) {
            request.setAttribute("guessedNum", guessedNum);
            request.setAttribute("randomNumber", randomNumber);
            response.sendRedirect("/correct");
            request.getRequestDispatcher("/guess-number-outcome.jsp").forward(request, response);
        } else {
            request.setAttribute("guessedNum", guessedNum);
            request.setAttribute("randomNumber", randomNumber);
            response.sendRedirect("/incorrect");
            request.getRequestDispatcher("/guess-number-outcome.jsp").forward(request, response);
        }
    }


}

