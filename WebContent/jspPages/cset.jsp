<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="pojo.Person" %><%--
  Created by IntelliJ IDEA.
  User: ramazan.demir
  Date: 27.1.2017
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--Scope zorunlu degildir varsayilan olarak page scope kullanilir. -->
<c:set var="mySessionAttribute" scope="session" value="my session value"/>
<c:set var="myRequestAtribute" scope="request">my request atribute</c:set>
<c:out value="${mySessionAttribute}"/>
<br>
<c:out value="${myRequestAtribute}"/>

<%--cset map --%>

<%
    Map map=new HashMap();
    request.setAttribute("mapAtribute",map);
%>

<c:set target="${mapAtribute}" property="adi" value="ramazan"/>
<c:set target="${mapAtribute}" property="soyadi">demir</c:set>
<br>
<c:out value="${mapAtribute.adi}"></c:out>
<c:out value="${mapAtribute['soyadi']}"></c:out>
<%--
<c:set target="${thereIsNoMap}" property="exception" value="javax.servlet.jsp.JspTagException"/>
--%>

<%-- cset bean--%>

<%
    Person person = new Person();
    request.setAttribute("myperson", person);
%>

<c:set target="${myperson}" property="name" value="ramazan"></c:set>
<c:set target="${myperson}" property="surname" value="demir"></c:set>
<c:set target="${myperson}" property="yas" value="28"></c:set>
<br>
<c:out value="${myperson.name}"></c:out>
<c:out value="${myperson.surname}"></c:out>
<c:out value="${myperson.yas}"></c:out>

<!-- target alani null olmamalidir! Bu durumda calisma zamaninda exception firlatir. -->

<%--
<c:set target="${thisIsNull}" property="thereIsNoPropery" value="javax.servlet.jsp.JspTagException"></c:set>
 --%>

<!--target null olmasa da eger property yoksa yine calisma zamaninda exception firlatilir. -->

<%--
<c:set target="${myperson}" property="thereIsNoPropery" value="javax.servlet.jsp.JspTagException"></c:set>
 --%>

</body>
</html>
