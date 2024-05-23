<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function addUser()
{
	document.fn.action="reg";
	document.fn.submit();
	
	}
function editUser()
{
	document.fn.action="edit";
	document.fn.submit();
	
	}
function deleteUser()
{
	document.fn.action="delete";
	document.fn.submit();
	
	}
</script>
</head>
<body>
<h1>Welcome to cjc..!!!</h1>
<form  name="fn">
<table border="1">
<tr>
<th>Uid</th>
<th>Name</th>
<th>Uname</th>
<th>Password</th>
<th>Mobile.No</th>

</tr>
<c:forEach items="${data}" var="stud"><!-- Foreach $(data) is variable name from import data from  Homecontroller class -->
<tr>
<td><input type="radio" name="uid" value="${stud.uid }"></td>
<td>${stud.name}</td>
<td>${stud.uname}</td>
<td>${stud.password}</td>
<td>${stud.mobileno}</td>
</tr>
</c:forEach>
</table>
<table>
<tr>
<td><input type="button" value="ADD" onclick="addUser()"></td>
</tr>
<tr>
<td><input type="button" value="UPDATE" onclick="editUser()"></td>
</tr><tr>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>
</tr>
</table>
</form>
</body>
</html>