import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        if (request.getParameter("reset") != null){
//            counter = 0;
//            out.println("<p>The counter says you've never viewed this page, but you aren't fooling me</p>");
//        }
//        counter++;
//        out.println("<h3>You have viewed this page " + counter + " times, aren't you bored?");
//    }
  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String resetParam = request.getParameter("reset");
        if (resetParam != null && resetParam.equals("true")){
            counter = 0;
            out.println("<p>The counter has been reset.</p>");
        }
        counter++;
        out.println("<h3>You have viewed this page " + counter + " times.</h3>");
        out.println("<p>To reset the counter, add ?reset=true to the URL.</p>");
    }
    
}