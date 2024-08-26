<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.cyber.success.CSJ33SpringBootProject.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% User user=(User)session.getAttribute("userKey"); %>

<h3><font color='blue'>hello!!!!<%=user.getUserName()%></font></h3>
<a href="addCourse">Add Courses</a><br>
<a href="viewCourse">View Course</a>
</body>
</html>