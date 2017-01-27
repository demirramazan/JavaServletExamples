<%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="salary" scope="session" value="1500"/>

<p> Your salary is : <c:out value="${salary}"/></p>

<c:choose>
    <c:when test="${salary ge 2000}">bad salary </c:when>
    <c:when test="${salary le 1000}"> salary is good</c:when>
    <c:when test="${salary <=100 }">low salary</c:when>
    <c:otherwise>excellent salary</c:otherwise>
</c:choose>
</body>
</html>
