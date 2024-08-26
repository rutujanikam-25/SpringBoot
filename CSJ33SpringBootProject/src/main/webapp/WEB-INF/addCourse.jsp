<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="addMyCourses" method="post">
<label for="courseName">Enter course name</label>
<input type="text" name="courseName"><br>

<label for="subject">Enter subject name</label>
<input type="checkbox" name="subject[0].subjectName" value="core java">CORE JAVA &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="subject[1].subjectName" value="JDBC API">JDBC API &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="subject[2].subjectName" value="HTML">HTML &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="subject[3].subjectName" value="CSS">CSS &nbsp;&nbsp;&nbsp;

<input type="checkbox" name="subject[4].subjectName" value="Spring Boot">Spring Boot &nbsp;&nbsp;&nbsp;

<input type="text" name="coursePrice"><br>


<input type="submit" value="ADD COURSE">



</form>
</body>
</html>