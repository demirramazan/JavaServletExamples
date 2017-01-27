<%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="result" scope="request" value="50"/>

<c:if test="${result > 45}">
    <p>you pass exam !<c:out value="${result}"/></p>
</c:if>
<c:set var="result2" scope="request" value="45"/>

<c:if test="${result2 lt 50}">
    <p> you fail exam! <c:out value="${result2}"/></p>
</c:if>

<c:set var="myName" scope="request" value="ramazan"/>

<c:if test="${myName eq 'ramazan'}">
<p>Hello(eq) , ${myName}<p>
    </c:if>

    <c:if test="${myName =='ramazan'}">
<p>Hello(==) , ${myName}<p>
    </c:if>
</body>
</html>
