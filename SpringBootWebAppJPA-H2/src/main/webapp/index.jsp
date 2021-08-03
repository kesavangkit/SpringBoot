<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Student</h1>
	<form action="addStudent">
		<table>
			<tr>
				<td><label>Id:</label></td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td><label>Name:</label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>Course:</label></td>
				<td><input type="text" name="course"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	<br><br><br>
	<br><br><br><br>
	<h1>View Student</h1>
	<form action="readStudent">
		<table>
			<tr>
				<td><label>Id:</label></td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td><label>Name:</label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>Course:</label></td>
				<td><input type="text" name="course"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>