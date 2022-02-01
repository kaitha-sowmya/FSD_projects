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
b.setSubid(Integer.parseInt(request.getParameter("sbid")));
b.setSubname(request.getParameter("sname"));
b.setTeacher(request.getParameter("Tname"));

int i=Subjectcrud.insert(b);
if(i>0){
	out.print("Inserted new Subject Successfully......");%><br><br>
	<a href="subTea.jsp">Display</a>
<% }
else{
	out.print("Insertion Failed");
}
%>
</body>
</html>