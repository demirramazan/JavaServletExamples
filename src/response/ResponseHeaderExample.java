package response;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ResponseHeaderExample",urlPatterns = { "/responseHeaderExample" })
public class ResponseHeaderExample extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			PrintWriter printWriter = resp.getWriter();
			resp.setHeader("arkadas", "mustafa");
			resp.setHeader("arkadas", "ismail");

			boolean b = resp.containsHeader("arkadas");
			printWriter.write("arkadas header'i var mi :" + b);

			String header = resp.getHeader("arkadas");
			System.out.println(header);
			resp.addHeader("arkadas", "ali");
			resp.addHeader("arkadas", "veli");
			Collection<String> headers = resp.getHeaders("arkadas");
			for (String string : headers) {
				printWriter.write("\n " + string);
			}
			resp.addDateHeader("today", Calendar.getInstance().getTimeInMillis());
			resp.setIntHeader("yas", 28);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
