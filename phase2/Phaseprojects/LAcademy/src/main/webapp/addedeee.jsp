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
EEE b=new EEE();
b.setCid(Integer.parseInt(request.getParameter("sbid")));
b.setSubject(request.getParameter("sname"));
b.setTeacher(request.getParameter("Tname"));

int i=Eeecrud.insert(b);
if(i>0){
	out.print("Inserted new Subject Successfully......");%><br><br>
	<a href="displayeee.jsp">Display</a>
	<a href="index.jsp">Menu</a>
<% }
else{
	out.print("Insertion Failed");
}
%>
</body>
</html>