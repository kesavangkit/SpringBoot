<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Oracle</title>
</head>
<body>
	<h1>Add Emplyoee</h1>
	<form action="addEmplyoee">
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
				<td><label>Dept:</label></td>
				<td><input type="text" name="dept"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
	<br><br><br>
	<br><br><br><br>
	<h1>View Employee</h1>
	<form action="readEmplyoee">
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
				<td><label>Dept:</label></td>
				<td><input type="text" name="dept"></td>
			</tr>
			<tr>
				<td><input type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>