<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list</title>
</head>
<body>
<table border="5px">

<tr>
<th>id</th>
<th>name</th>
<th>salary</th>
<th>update</th>
<th>dalete</th>
</tr>

<tr>
<c:forEach items="${empl}" var="emp">
<td><c:out value="${emp.eid}"></c:out></td>
<td><c:out value="${emp.ename}"></c:out></td>
<td><c:out value="${emp.esal}"></c:out></td>
<td> <a href="./update?eid=${emp.eid}">update</a></td>
<td> <a href="./delete?eid=${emp.eid}">delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>