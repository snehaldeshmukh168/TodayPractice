<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <center><h1>All Infromation</h1></center>
  <form action="fn">
	<table border="1" align="center">
	  <th>Sr No</th>
		<th>SID</th>
		<th>SName</th>
		<th>SUser Name</th>
		<th>SPassword</th>
		<th>Saddr</th>
		<tr>
			<c:forEach items="${data}" var="student">
				<br>
				<td><input type="radio" name="sr no" value="${user.sid}"></td>
				<td>${student.sid}</td>
				<td>${student.sname}</td>
				<td>${student.suname}</td>
				<td>${student.spass}</td>
				<td>${student.saddr}</td>
				
		</tr>
		</c:forEach>

	</table>
  </script>
</body>
</html>