<%@page import="com.la.crud.*"%>
<%@page import="java.text.SimpleDateFormat"%>
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
Subject b=new Subject();
b.setSubid(Integer.parseInt(request.getParameter("subid")));
b.setSubname(request.getParameter("subname"));
b.setTeacher(request.getParameter("tname"));

int i=Subjectcrud.update(b);
if(i>0){
	out.print("STUDENT DETAILS UPDATED SUCCESSFULLY.......");
	%><br><br>  
	
	<form  action="subTea.jsp">
<input type="submit" value="DISPLAY UPDATED LIST">
</form>
<%
}
else{
	out.print("UPDATION FAILED.......");
}
%>	

</body>
</html>