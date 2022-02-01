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
Teacher b=new Teacher();
b.setTid(Integer.parseInt(request.getParameter("sid")));
b.setFirstname(request.getParameter("fname"));
b.setLastname(request.getParameter("lname"));
String dob=request.getParameter("dob");
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
java.util.Date dobfinal=sdf.parse(dob);
b.setDOB(dobfinal);
b.setAddress(request.getParameter("add"));
b.setPhone(Integer.parseInt(request.getParameter("pno")));
b.setDesignation(request.getParameter("clas"));

int i=Teachercrud.update(b);
if(i>0){
	out.print("teacher details updation succcessful");
	%><br><br>  
	
	<form  action="Teacher.jsp">
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