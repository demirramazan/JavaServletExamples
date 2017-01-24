package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/URLRewriting" })
public class URLRewriting extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// resp.setContentType("txt/html");

		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("ramazan", "demir");

		PrintWriter printWriter = resp.getWriter();
		// String nonEncodedUrl = "GetSession";
		String encodeurl = resp.encodeURL("GetSession");

		printWriter.println("<html><head>");
		printWriter.println("<title>URL Rewriter</title></head>");
		// printWriter.println("<body>Giris - <a href=\"" + nonEncodedUrl + "\">
		// Click Here </a>.");
		printWriter.println("<body>Giris - <a href=\"" + encodeurl + "\"> Click Here </a>.");
		printWriter.println("</body></html>");
	}

}
