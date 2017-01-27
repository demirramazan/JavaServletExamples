<%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="myattr" scope="request" value="request scope attribute"/>
<c:set var="myattr" scope="page" value="page scope attr"/>
<c:set var="myattr" scope="session">session scope attribute</c:set>
<c:set var="myattribute" scope="application" value="application scope attribute"/>

<c:out value="${myattr}"></c:out>
<br>
<c:out value="${pageScope.myattr}"></c:out>
<br>
<c:out value="${requestScope.myattr}"></c:out>
<br>
<c:out value="${sessionScope.myattr}"></c:out>
<br>
<c:out value="${applicationScope.myattribute}"></c:out>

<c:remove var="myattr"></c:remove>

<c:out value="${myattr}"></c:out>
<br>
<c:out value="${pageScope.myattr}"></c:out>
<br>
<c:out value="${requestScope.myattr}"></c:out>
<br>
<c:out value="${sessionScope.myattr}"></c:out>
<br>
<c:out value="${applicationScope.myattribute}"></c:out>
</body>
</html>
