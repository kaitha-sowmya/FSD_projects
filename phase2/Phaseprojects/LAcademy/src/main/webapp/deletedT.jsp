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
Teacher b=new Teacher();

b.setTid(Integer.parseInt(request.getParameter("tid")));
int i=Teachercrud.delete(b);
if(i>0){
	out.print("Deleted Successfully.....");%><br><br>
	
	
	
<% 	
}
else{
	out.print("Deletion failed....");
}
%><br><br><br>
<a href="Teacher.jsp">UPDATED LIST </a>
</body>
</html>