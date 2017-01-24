import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ramazan.demir on 5.1.2017.
 */
@WebServlet("/servletlifecycle")
public class ServletLifecycle  extends HttpServlet{
    public static ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Hello init() method... init method bir kere calisir...");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter=resp.getWriter();
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String s="servlet lifecycle...";
        printWriter.print("<html><body><h2>"+s+"</h2>");
        printWriter.print("<p>date: "+format.format(new Date())+" </p>");
        printWriter.print("</body></html>");

    }

    @Override
    public void destroy() {
        System.out.println("destroy servlet.....");
    }
}
