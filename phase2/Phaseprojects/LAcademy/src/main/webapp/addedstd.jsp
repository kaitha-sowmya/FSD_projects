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
Student b=new Student();
b.setSid(Integer.parseInt(request.getParameter("sid")));
b.setFirstname(request.getParameter("fname"));
b.setLastname(request.getParameter("lname"));
String dob=request.getParameter("dob");
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
java.util.Date dobfinal=sdf.parse(dob);
b.setDOB(dobfinal);
b.setAddress(request.getParameter("add"));
b.setPhone(Integer.parseInt(request.getParameter("pno")));
b.setClassname(request.getParameter("clas"));

int i=Studentcrud.insert(b);
if(i>0){
	out.print("ADDED STUDENT INTO CLASS.......");
	%><br><br>  
	
	<form  action="displaystd.jsp">
<input type="submit" value="DISPLAY UPDATED LIST">
</form>
	
	<%
}
else{
	out.print("STUDENT UPDATION FAILED");
}
%>



</body>
</html>