import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ServletPerformEvent")
public class ServletPerformEvent extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      here Servlet Request Attribute Event occur
        request.setAttribute("school","KIT");
        request.setAttribute("school","Toul Thmor");
        request.removeAttribute("school");
//      here httpSessionAttribe Event occur
        HttpSession hs = request.getSession();
        hs.setAttribute("City","Phnom Penh");
        hs.setAttribute("City", "KPC");
        hs.removeAttribute("City");
    }
}
