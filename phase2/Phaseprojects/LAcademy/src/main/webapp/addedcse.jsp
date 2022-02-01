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
CSE b=new CSE();
b.setCid(Integer.parseInt(request.getParameter("sbid")));
b.setSubject(request.getParameter("sname"));
b.setTeacher(request.getParameter("Tname"));
Csecrud c=new Csecrud();
int i=c.insert(b);
if(i>0){
	out.print("Inserted new Subject Successfully......");%><br><br>
	<a href="displaycse.jsp">Display</a>
<% }
else{
	out.print("Insertion Failed");
}
%>
</body>
</html>