<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>${exMap.gun}
	${exMap.ay} ${exMap.yil} 
	${exMap.thereIsNoKey}	<!-- ekrana birsey yazdirmaz hata vermez -->

	${thereIsNoMap.thereIsNoKey}	<!--ekrana birsey yazdirmaz hata vermez -->
	<%--index 0 dan baslar. 0 , "1" ya da '2' seklinde yapabiliriz. --%>
	${myArray[0]} 
	${myArray["1"]}
   	${myArray['2']}
   		
   		
   		<%--EvaluatedString " " karakterleri arasinda olmadigi icin 
	Container EvaluatedString isimli attribute var mi diye bakacaktir ! --%>
	<%--EvaluatedString isimli attribute mevcut bu nedenle degeri kullanilacaktir "key1" --%>
   	${exMap[EvaluatedString]}
   	
</body>
</html>