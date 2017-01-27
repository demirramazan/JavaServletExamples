<%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%="Hello JSP Expression" %>

<c:out value="Hello JSTL !" ></c:out>


<%
    request.setAttribute("name","ramazandemir");
%>

<%= request.getAttribute("name") %>
<br>
</body>
</html>
