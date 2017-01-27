package inclusion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by ramazan.demir on 27.1.2017.
 */
@WebServlet(name = "DynamicIncludeMe " ,urlPatterns = {"/DynamicIncludeMe"})
public class DynamicIncludeMe extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer=response.getWriter();

        writer.println("Dynamic Included Me servlet");
    }
}
