package attribute;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ContextScopeExample",urlPatterns = { "/contextScopeExample" })
public class ContextScopeExample extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().setAttribute("ramazan", 28);
		getServletContext().setAttribute("zeynep", 24);
	}
}
