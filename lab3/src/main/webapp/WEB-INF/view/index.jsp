<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table style="border: thin solid black;">
        <tr>
            <th>Roll No.</th>
            <th>Name</th>
            <th>Class Name</th>
            <th>Delete?</th>
        </tr>
        <c:forEach items="${sinhViens}" var="sv">
            <tr>
                <td>${sv.roll}</td>
                <td>${sv.fullName}</td>
                <td>${sv.className}</td>
                <td><a href="delete?roll=${sv.roll}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>