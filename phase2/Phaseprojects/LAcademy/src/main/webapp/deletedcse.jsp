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
CSE b=new CSE();
Csecrud c=new Csecrud();
b.setCid(Integer.parseInt(request.getParameter("sid")));
int i=c.delete(b);
if(i>0){
	out.print("Deleted Successfully.....");%><br><br>
	
	
	
<% 	
}
else{
	out.print("Deletion failed....");
}
%>
<br>
<a href="displaycse.jsp">UPDATE</a>
</body>
</html>