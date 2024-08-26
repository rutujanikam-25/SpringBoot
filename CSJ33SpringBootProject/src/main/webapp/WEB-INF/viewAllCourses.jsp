<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.cyber.success.CSJ33SpringBootProject.model.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2" cellpadding="5" cellspacing="5">
<th>ID</th>
<th>COURSE NAME</th>
<th>PRICE</th>
<th>EDIT</th>

<% List<Course> list=(List<Course>)request.getAttribute("courseList");
for(Course c:list)
{
	
%>
<tr>
<td><%=c.getCourseId() %></td>
<td><%=c.getCourseName() %></td>
<td><%=c.getCoursePrice() %></td>

<td><a href='EditCourse/<%=c.getCourseId() %>'>EDIT</a>
<td><a href='deleteCourse/<%=c.getCourseId() %>'>DELETE</a></td>
</tr>
</table>
<h2><font color='blue'>*****Subject Details*****</font></h2>
<table border="2", cellpadding="5", cellspacing="5">
<th>SID</th>
<th>SNAME></th>
<th>CID</th>
<th>EDIT</th>
<th>DELETE</th>
<%
List<Subject> listOfSubject=c.getSubject();
for(Subject s:listOfSubject)
{ %>
<tr>
<td><%=s.getSubjectCode() %></td>
<td><%=s.getSubjectName() %></td>
<td><%=s.getCourse().getCourseId() %>
<td><a href='EditSubject/<%=c.getCourseId() %>'>EDIT</a>
<td><a href='deleteSubject/<%=c.getCourseId() %>'>DELETE</a>
</tr>
<% }
}
%>
</table>
</body>
</html>