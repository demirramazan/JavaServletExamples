<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="pojo.Person" %><%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 14:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int [] ints={1,3,4,6,7,8,11,99};
    request.setAttribute("myarray" , ints);
%>
<c:forEach var="num" items="${myarray}">
    <c:out value="${num}"/>
</c:forEach>

<c:forEach var="num2" items="${myarray}" varStatus="loopStatus">
    index:<c:out value="${loopStatus.index}"/>
    <c:out value="${num2}"/><br>
</c:forEach>
<%
    List list=new ArrayList();
    list.add("ramazan");
    list.add("demir");

    request.setAttribute("list",list);
%>

<c:forEach var="lst" items="${list}">
    <c:out value="${lst}"/>
</c:forEach>
<br>
<%
    java.util.Map<String, String> myMap = new java.util.HashMap<String, String>();
    myMap.put("key1", "value1");
    myMap.put("key2", "value2");
    myMap.put("key3", "value3");

    request.setAttribute("myMapAttribute", myMap);
%>

<c:forEach var="entry" items="${myMapAttribute}">
    <c:out value="${entry.key}" />
    <c:out value="${entry.value}" />
</c:forEach>
</body>
</html>
