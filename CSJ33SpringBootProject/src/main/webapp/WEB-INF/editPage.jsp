<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cyber.success.CSJ33SpringBootProject.model.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Course course=(Course)request.getAttribute("courseKey") ;%>
<form action="/SpringBoot/UpdateCourse" method="post">
<label for="courseId"></label>
<input type="text" name="t1" value=<%=course.getCourseId()  %>>
<br>
<label for="courseName"></label>
<input type="text" name="t2" value=<%=course.getCourseName() %>>
<br>
<label for="coursePrice"></label>
<input type="text" name="t3" value=<%=course.getCoursePrice() %>>
<br>

<% List<Subject> list=course.getSubject();
		int count=1;
		
		for(Subject s:list){
			String str=s.getSubjectName();
			String finalStr=null;
			if(str!=null){
				String[] strArray=str.split(" ");
				if(strArray.length==2)
				{
				finalStr=strArray[0]+strArray[1];
				}else if(strArray.length==1)
				{
					finalStr=strArray[0];
				}
			}
			System.out.println("hi"+str);
		%>
		<label for="subject">subject <%=count++ %></label>
		<input type="text"  value=<%=finalStr %>><br>
		<%} %>
<input type="submit" value=update>
</form>
</body>
</html>