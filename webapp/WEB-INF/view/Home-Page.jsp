<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>
	<h1 align="center">LOVE CALCULATOR</h1>
	<hr>
	<form:form action="process-homepage" method="get" modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">your name:</label>
				<form:input path="userName" id="yn"></form:input>
			</p>
			<p>
				<label for="cn">crush name:</label>
				<form:input path="crushName" id="cn"></form:input>
			</p>

			<input type="submit" value="calculate">
		</div>
	</form:form>
</body>
</html>