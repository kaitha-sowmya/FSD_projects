<%@page import="com.la.bean.*"%>
<%@page import="com.la.crud.*"%>
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
Subject b=new Subject();

b.setSubid(Integer.parseInt(request.getParameter("subid")));
int i=Subjectcrud.delete(b);
if(i>0){
	out.print("Deleted Successfully.....");%><br><br>
	
	<form action="subTea.jsp">
	<input type="submit" value="updated list">
	</form>
	
<% 	
}
else{
	out.print("Deletion failed....");
}
%>



</body>
</html>