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
<% Bill bObj=(Bill)request.getAttribute("billKey"); %>
<table border="4" cellspaing="5" cellpadding="5">
<tr>
<td>Bill Details</td>
<td>Value</td>
</tr>
<tr>
<td>Bill Name</td>
<td><%=bObj.getUserName() %></td>
</tr>
<tr>
<td>Bill Date</td>
<td><%=bObj.getBillDate() %></td>
</tr>
<tr>
<td>Bill Id</td>
<td><%=bObj.getBillId() %></td>
</tr>
<tr>
<td>Bill Amount</td>
<td><%=bObj.getBillAmount() %></td>
</tr>
</table>
</body>
</html>