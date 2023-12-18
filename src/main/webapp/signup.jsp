<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SignUp page</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<div>
			<h1>Sign Up Page</h1>
		</div>
		<div>
			<form action="signup" method="post">
				<label>Enter your firstName :</label>
				<div>
					<input type="text" name="firstname" required>
				</div>
				<label>Enter your lastName :</label>
				<div>
					<input type="text" name="lastname" required>
				</div>
				<label>Enter your phone number :</label>
				<div>
					<input type="text" name="phone" required>
				</div>
				<label>Enter your UserName :</label>
				<div>
					<input type="text" name="username" required>
				</div>
				<label>Enter your Password :</label>
				<div>
					<input type="password" name="password" required>
				</div>
				<label>Enter your E-mail :</label>
				<div>
					<input type="email" name="email" required>
				</div>
				<label>Choose your gender :</label>
				<div>
					<input type="radio" name="gender" value="male">Male
				</div>
				<div>
					<input type="radio" name="gender" value="female">Female
				</div>
				<div>
					<input type="submit" value="regester">
					<input type="reset" value="reset">
				</div>
			</form>
		</div>
	</body>
</html>