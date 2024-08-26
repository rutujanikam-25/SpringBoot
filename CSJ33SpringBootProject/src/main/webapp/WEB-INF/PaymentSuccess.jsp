<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.cyber.success.CSJ33SpringBootProject.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Book bk=(Book)request.getAttribute("bookKey");
%>
<font color='blue'>Hello  <%=bk.getUserName()%> !!!!your Booking id <%=bk.getBookingId() %></font><br>
<font color='green'> Your Batch Code is <%=bk.getBatchName() %></font><br>
<font color='red'> your payment status is <%=bk.getPaymentStatus() %></font><br>
<a href="generateBill">Get Your Bill</a>
</body>
</html>