<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person1" class="pojo.Person">
		<jsp:setProperty name="person1" property="name"
			value='<%=request.getParameter("firstName")%>' />
		<jsp:setProperty name="person1" property="surname"
			value='<%=request.getParameter("lastName")%>' />
		<jsp:setProperty name="person1" property="yas"
			value='<%=request.getParameter("age")%>' />
	</jsp:useBean>
	<jsp:getProperty property="name" name="person1" />
	<jsp:getProperty property="surname" name="person1" />
	<jsp:getProperty property="yas" name="person1" />


	<jsp:useBean id="person2" class="pojo.Person">
		<jsp:setProperty name="person2" property="name" param="firstName" />
		<jsp:setProperty name="person2" property="surname" param="lastName" />
		<jsp:setProperty name="person2" property="yas" param="age" />
	</jsp:useBean>

	<jsp:getProperty property="name" name="person2" />
	<jsp:getProperty property="surname" name="person2" />
	<jsp:getProperty property="yas" name="person2" />
</body>
</html>