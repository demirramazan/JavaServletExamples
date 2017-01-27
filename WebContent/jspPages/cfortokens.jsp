<%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forTokens items="ali veli zeki metin" delims=" " var="value">
    <c:out value="${value}" />
</c:forTokens>

<br>

<c:forTokens items="value1,value2,value3,value4" delims="," var="value">
    <c:out value="${value}" />
</c:forTokens>

<br>

<c:forTokens items="value1:value2;value3:value4" delims=", : ;" var="value">
    <c:out value="${value}" />
</c:forTokens>
<br>

<c:forTokens items="2.3:5;32*7,11ü45" delims=". , ; * ü" var="c">
    <c:out value="${c}"/>
</c:forTokens>

</body>
</html>
