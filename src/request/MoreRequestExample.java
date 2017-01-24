package request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="MoreRequestExample",urlPatterns={"/moreRequestExample"})
public class MoreRequestExample extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.write("<html><body>");
		String serverName = req.getServerName();
		String hostHeaderInfo = req.getHeader("host");
		int serverPort = req.getServerPort();
		int localPort = req.getLocalPort();
		int remotePort = req.getRemotePort();
		String method = req.getMethod();
		String contextPath = req.getContextPath();
		Enumeration<String> enumeration = req.getHeaderNames();
		writer.write(serverName + "<br/>");
		writer.write(hostHeaderInfo + "<br/>");
		writer.write(serverPort + "<br/>");
		writer.write(localPort + "<br/>");
		writer.write(remotePort + "<br/>");
		writer.write(method + "<br/>");
		writer.write(contextPath + "<br/>");
		writer.write("</body></html>");
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			writer.write(string + "<br/>");
			
		}
		writer.close();

	}
}
