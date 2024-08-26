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
<h2><font color='green'>Welcome <%=user.getUserName() %> to portal</font></h2><br>
<a href="viewCourseByStudent1"><button>VIEW Course</button></a><br>

</body>
</html>