<%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>####Request Dispatcher include###</p>

<% RequestDispatcher dispatcher = request.getRequestDispatcher("/DynamicIncludeMe");
    dispatcher.forward(request, response);
%>

<p>### pageContext.include###</p>

<% pageContext.include("/DynamicIncludeMe"); %>

<p>##### jsp include action ##### </p>
<jsp:include page="/DynamicIncludeMe"></jsp:include>
</body>
</html>
