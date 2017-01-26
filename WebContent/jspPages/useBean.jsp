<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="myperson" class=pojo.Person scope="request">
	</jsp:useBean>


	<jsp:getProperty property="name" name="myperson" />
	<jsp:getProperty property="surname" name="myperson" />
	<jsp:getProperty property="yas" name="myperson" />

	<jsp:useBean id="personOther" class="pojo.Person" scope="request"></jsp:useBean>
	<jsp:setProperty property="name" name="personOther" value="mustafa" />
	<jsp:setProperty property="surname" name="personOther" value="karaman" />
	<jsp:setProperty property="yas" name="personOther" value="35" />

	<jsp:getProperty property="name" name="personOther" />
	<jsp:getProperty property="surname" name="personOther" />
	<jsp:getProperty property="yas" name="personOther" />
</body>
</html>