<%@page import="pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%=((Employee) request.getAttribute("myemp")).getDepartment().getDepartId()%>
	<%=((Employee) request.getAttribute("myemp")).getDepartment().getDepartmentName()%>

	<jsp:useBean id="myemp" class="pojo.Employee" scope="request"></jsp:useBean>

	<jsp:getProperty property="department" name="myemp" />
</body>
</html>