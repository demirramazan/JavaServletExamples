package expression;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DotOperatorExpressionExample",urlPatterns = { "/DotOperatorExpressionExample" })
public class DotOperatorExpressionExample extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		Map<String, String> expressionMap = new LinkedHashMap<String, String>();
		expressionMap.put("gun", "26");
		expressionMap.put("ay", "ocak");
		expressionMap.put("yil", "2017");

		request.setAttribute("exMap", expressionMap);
		
		List list = new ArrayList();
		list.add("list element1");
		list.add("list element2");
		request.setAttribute("myList", list);
		
		request.setAttribute("EvaluatedString", "key1");

		 String[] array= {"key2"};
		 request.setAttribute("myarray", array);

		RequestDispatcher dispatcher = request.getRequestDispatcher("jspPages/dotOperatorEL.jsp");
		dispatcher.forward(request, response);

	}
}
