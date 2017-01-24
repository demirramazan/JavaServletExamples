<%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 5.1.2017
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@page import="requestattribute.Person"%>
<html>
<head>
<title>$Title$</title>
</head>
<body>
	<%
		List<Person> list = (List<Person>) request.getAttribute("personList");
	%>
	<table style="width: 300px">
		<%
			for (Person person : list) {
		%>
		<tr>
			<td><%=person.getPersonId() %></td>
			<td><%=person.getName()%></td>
			<td><%=person.getSurName()%></td>
			<td><%=person.getPhoneNumber()%></td>
		</tr>
		<%
			}
		%>
	
</body>
</html>
