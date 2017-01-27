package expression;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Department;
import pojo.Employee;

@WebServlet(urlPatterns = { "/withoutExpressionLanguage" })
public class ExpressionLanguageExample extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Department department = new Department(10, "Software Development");
		Employee employee = new Employee(1, "ramazan", department);
		req.setAttribute("myemp", employee);

		RequestDispatcher dispatcher = req.getRequestDispatcher("jspPages/withoutEL.jsp");
		dispatcher.forward(req, resp);
	}
}
