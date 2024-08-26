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
<%
List<String>allApi=new ArrayList();
allApi.add("23456@ybl");
allApi.add("5643@hdfc");
allApi.add("7654@ok");
allApi.add("9354@ok");
%>

<%

String requestedApi=(String)request.getAttribute("idKey");

int flag=0;
for(String api:allApi)
{
	if(api.equals(requestedApi))
	{
	flag = 1;
	break;
}
}
if(flag==1)
	
{
	Course cobj=(Course)session.getAttribute("bookingCourse");
	double price=cobj.getCoursePrice();
	double priceWithGST=price+(12*price/100);

%>
<script type="text/javascript">
alert('congratulation!!!!')
</script>



<form action="startPayment" method="post">
<input type="text" value='<%=priceWithGST %>' name="p1">
<input type="submit" value="pay">
</form>
<%} else{ %>
<script type="text/javascript">
var msg="Invalid ID"
window.alert(msg)
</script>
<%} %>
</body>
</html>