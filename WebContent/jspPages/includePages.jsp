<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@include file="forwardIt.jsp"%>
<p> this is includeDirective.jsp </p>
<jsp:include page="forwardIt.jsp"/>
<p> this is includePage.jsp </p>
<c:import url="param1.jsp"/>
<p> this is cimport.jsp </p>
</body>
</html>
