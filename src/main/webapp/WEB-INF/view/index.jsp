<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>INDEX</title>
</head>
<body>
	<h2>Все пользователи</h2>
	<br />
	<ul>
		<c:forEach var="user" items="${requestScope.users}">
				Имя: <c:out value="${user.name}" />
			<br />
				Возраст: <c:out value="${user.age}" />
			<br />
		</c:forEach>
	</ul>

	<h2>Создание нового пользователя</h2>
	<br />

	<form method="post" action="">
		<label>Имя<input type="text" name="name"></label><br>
		
		<label>Возраст<input type="number" name="age"></label><br>
		
		<input type="submit" value="Ok" name="Ok"><br>
	</form>

</body>
</html>