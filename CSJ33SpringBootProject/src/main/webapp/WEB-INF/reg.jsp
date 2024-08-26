<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="sky blue">
<center>
<form action="signup"  method="post">
<level for="name">First Name</level>
<input type="text" name="firstName">&nbsp;&nbsp;

<level for="name">Last Name</level>
<input type="text" name="lastName"><br>

<level for="password">Enter Password</level>
<input type="text" name="user.password"><br>

<level for="phone">Enter phone</level>
<input type="text" name="phone"><br>

<level for="username">Enter user name</level>
<input type="text" name="user.userName"><br>

<level for="email">Enter Email</level>
<input type="text" name="emailId"><br>

<level for="dob">Enter DOB</level>
<input type="text" name="dob"><br>

<level for="user_type">Enter UserType</level>
<select name="user.userType">

<option value="admin">Admin</option>
<option value="student">Student</option>
</select>
<input type="submit" value="signup">
</form>
</center>

</body>
</html>