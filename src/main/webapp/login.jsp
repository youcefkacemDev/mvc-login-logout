<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login page</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<div>
			<h1>Log In Page</h1>
		</div>
		<div>
			<form action="login" method="post">
				<label>Enter your UserName :</label>
				<div>
					<input type="text" name="username" required>
				</div>
				<label>Enter your Password :</label>
				<div>
					<input type="password" name="password" required>
				</div>
				<div>
					<input type="submit" value="login">
				</div>
			</form>
		</div>
	</body>
</html>