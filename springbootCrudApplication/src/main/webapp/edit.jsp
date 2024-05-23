<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">EDIT DATA</h1>
</head>
<body>
<form action="updatestu">
<table border="1">
<tr>
<td>UID:-</td>
<td><input type="hidden" name="uid" value="${data.uid} "></td>
</tr>
<tr>
<td>Name:-</td>
<td><input type="text" name="name" value="${data.name}"></td>
</tr>
<tr>
<td>User Name:-</td>
<td><input type="text" name="uname" value="${data.uname}"></td>
</tr>
<tr>
<td>Password:-</td>
<td><input type="text" name="password" value="${data.password}"></td>
</tr>
<tr>
<td>MobileNo:-</td>
<td><input type="text" name="mobileno" value="${data.mobileno}"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>

</tr>
</table>
</form>

</body>
</html>