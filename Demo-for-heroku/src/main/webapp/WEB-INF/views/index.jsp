<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Demo app</title>
</head>
<body>
	<form action="/" method="post">
		<input name="name" placeholder="Name"><br>
		<input name="age" placeholder="Age"><br>
		<input type="submit" value="Add person"><br>
	</form>
	<div>
		<ul>
			<c:forEach items="${persons}" var="person">
				<li>${person.name} ${person.age} years</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>