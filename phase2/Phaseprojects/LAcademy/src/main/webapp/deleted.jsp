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
Classes b=new Classes();

b.setCid(Integer.parseInt(request.getParameter("cid")));
int i=Classcrud.delete(b);
if(i>0){
	out.print("Deleted Successfully.....");%><br><br>
	
	<form action="Display.jsp">
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