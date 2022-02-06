import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pick-color") //user goes to /pick color, see the webpage, prompted to enter fave color(using text input).
public class PickColorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("pick-color.jsp").forward(request,response);//sending the request to pick-colo.jsp
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String color = request.getParameter("color"); //REQUEST - get the values of attributes or parameters that are passed to a JSP page.

        response.sendRedirect("/view-color?color=" + color); //RESPONSE - (javax.servlet.http.HttpServletResponse): To send information to the client
    }
}
