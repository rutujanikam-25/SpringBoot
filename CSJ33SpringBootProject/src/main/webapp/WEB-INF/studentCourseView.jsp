<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cyber.success.CSJ33SpringBootProject.model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='4'>

<%
   List<Course> list=(List<Course>)request.getAttribute("viewKey");
   for(Course c:list){
	   %>
	  <tr>
	  <%=c.getCourseId() %> 
	 <font color='red' ><%=c.getCourseName() %></font>
	  <%=c.getCoursePrice() %>
	   
	   <%List<Subject> subjectList=c.getSubject();
	     String allSubjects=" ";
	     for(int i=0;i<subjectList.size();i++){
	    	 allSubjects=allSubjects+subjectList.get(i).getSubjectName();
	     }
	   %>
	   <%=allSubjects %>
	   <a href='bookCourse/<%=c.getCourseId() %>'>Book</a>
	   <br>
	   <% 
   }
%>
</table>
</body>
</html>