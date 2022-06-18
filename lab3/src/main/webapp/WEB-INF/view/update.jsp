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
	<form:form action="UpdateStudent" modelAttribute="sv">
		<form:label path="roll" >Roll Number</form:label>
		<form:input path="roll" readonly="true"/><br />

		<form:label path="fullName" >Student name</form:label>
		<form:input path="fullName" />
		<form:errors path="fullName"/><br />

		<form:label path="className" >Class name</form:label>
		<form:input path="className" />
		<form:errors path="className"/><br />

		<input type="submit" value="Update"/>
		<a href="/">Return</a>
	</form:form>
</body>
</html>