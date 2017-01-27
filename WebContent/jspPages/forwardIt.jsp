<%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:forward page="handleIt.jsp">asd</jsp:forward>
<% pageContext.forward("handleIt.jsp");%>
<%
    RequestDispatcher dispatcher=request.getRequestDispatcher("handleIt.jsp");
    dispatcher.forward(request,response);
%>
</body>
</html>
