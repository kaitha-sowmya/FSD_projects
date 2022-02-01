<%@page import="com.la.bean.*"%>
<%@page import="java.text.SimpleDateFormat"%>
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
b.setFirstname(request.getParameter("fname"));
b.setLastname(request.getParameter("lname"));
String dob=request.getParameter("dob");
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
java.util.Date dobfinal=sdf.parse(dob);
b.setDOB(dobfinal);
b.setAddress(request.getParameter("add"));
b.setPhone(Integer.parseInt(request.getParameter("pno")));
b.setDesignation(request.getParameter("design"));

int i=Teachercrud.insert(b);
if(i>0){
	out.print("New teacher added");
	%><br><br>  
	
	<form  action="Teacher.jsp">
<input type="submit" value="DISPLAY UPDATED LIST">
</form>
	
	<%
}
else{
	out.print("TEACHER UPDATION FAILED");
}
%>



</body>
</html>