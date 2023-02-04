<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./delete" method="post">
id<input type="text" name="eid" value="${empl.eid}" readonly="readonly"></br>
name<input type="text" name="ename" value="${empl.ename}"></br>
salary<input type="text" name="esal" value="${empl.esal}"></br>
<input type="submit" value="delete">
</body>
</html>