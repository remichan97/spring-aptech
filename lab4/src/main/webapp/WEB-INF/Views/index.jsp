<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
</head>

<body>
	<form:form action="XuLy" modelAttribute="sv">
		<form:label path="roll" >Roll Number</form:label>
		<form:input path="roll" />
		<form:errors path="roll"/><br />

		<form:label path="name" >Student name</form:label>
		<form:input path="name" />
		<form:errors path="name"/><br />

		<form:label path="address" >Address</form:label>
		<form:input path="address" />
		<form:errors path="address"/><br />

		<input type="submit" />
	</form:form>
</body>

		</html>