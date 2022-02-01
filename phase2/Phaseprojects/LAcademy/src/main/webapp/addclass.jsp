<%@page import="com.la.bean.*"%>
<%@page import="com.la.crud.*"%>
<%@ page errorPage="error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Classes b=new Classes();
Classcrud c=new Classcrud();
b.setCid(Integer.parseInt(request.getParameter("cid")));
b.setCname(request.getParameter("cname"));
int i=Classcrud.insert(b);
if(i>0){
	out.print("Inserted new Class Successfully......");%><br><br>
	<a href="Display.jsp">Display</a>
<% }
else{
	out.print("Insertion Failed");
}
%>
</body>
</html>