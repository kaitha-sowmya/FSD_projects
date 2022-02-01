<%@page import="com.la.crud.*"%>
<%@page import="com.la.bean.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
ECE b=new ECE();
b.setCid(Integer.parseInt(request.getParameter("sid")));
int i=Ececrud.delete(b);
if(i>0){
	out.print("Deleted Successfully.....");%><br><br>
	
<% 	
}
else{
	out.print("Deletion failed....");
}
%>
<a href="displayece.jsp">UPDATE</a>
</body>
</html>