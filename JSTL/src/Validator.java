import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.*;

public class Validator extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        if (request.getParameter("password").equals("root")){
            ArrayList arr = new  ArrayList<EmployeeBean>();
            EmployeeBean o1 = new EmployeeBean();
            EmployeeBean o2 = new EmployeeBean();
            EmployeeBean o3 = new EmployeeBean();
            o1.setId(123);
            o2.setId(343);
            o3.setId(911);
            o1.setName("Dara");
            o2.setName("Teng");
            o3.setName("Heng");
            arr.add(o1);
            arr.add(o2);
            arr.add(o3);
            request.setAttribute("items", arr);
            request.getRequestDispatcher("next.jsp").forward(request, response);
        }
        else{
            response.getWriter().println("<h1>Wrong Password</h1>");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
