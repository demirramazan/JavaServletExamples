package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RequestExample", urlPatterns = { "/requestExample" })
public class RequestExample extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter writer = response.getWriter();
		writer.write(request.getParameter("name") + " ");
		writer.write(request.getParameter("surName") + " ");
		writer.write(request.getParameter("marialStatus") + " ");
		String[] proLangs = request.getParameterValues("proLang");
		if (proLangs != null) {
			for (int i = 0; i < proLangs.length; i++) {
				writer.write(" " + proLangs[i] + " ");
			}
		}
	}
}
