<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- JSP Scriptlet --%>
	<%
		System.out.println("Hello JSP!");
	%>
	<%
		String ad = "ramazan";
		int yas = 28;
		out.print(ad);
	%>
	<%=ad%>
	<%=yas%>
	<%!public int yasHesapla(int dogumYil) {
		int yas = 0;
		Date now = new Date();
		int fark = now.getYear() - dogumYil;
		yas = fark;
		return yas;
	}%>
	<%!private int sum = 0;

	public int addNumber(int n1, int n2) {
		sum = n1 + n2;
		return sum;
	}%>
	<%=addNumber(5, 7)%>
	<%=yasHesapla(1988)%>
	<jsp:attribute name=""></jsp:attribute>

</body>
</html>