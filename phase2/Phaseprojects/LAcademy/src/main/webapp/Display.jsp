
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.ResultSet"%>
    <%@ page import="com.la.crud.Classcrud"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  align="center" action="displaystd.jsp">
<input type="submit" value="STUDENT">
</form>

<form  align="center" action="subTea.jsp">
<input type="submit" value="SUBJECT">
</form>

<form  align="center" action="Teacher.jsp">
<input type="submit" value="TEACHER">
</form><br><br>





<h1 align="center">List Of Classes</h1>
<%
Classcrud crud=new Classcrud();
ResultSet rs=crud.select();%>

<form align="center" action="newclass.jsp">
<input type="submit" value="Add New Class">
</form><br><br>


<table align="center" border=2>
    <tr>
        <th>cid</th>
        <th>cname</th>
        <th>Action</th>
        </tr>
     <%  while(rs.next()){
	
	  %> 
	      <td> <%out.print(rs.getInt(1));%></td>
	      <td><%out.print(rs.getString(2));%></td> 
	      <td><a href="edit.jsp">EDIT</a></td>
	      <td><a href="delete.jsp">DELETE</a></td>
	      </tr>		<tr>
<%	
}
%>

</table><br><br>



<h1 Align="center">SUBJECT-TEACHER</h1>
 
<table align="center" border=2>
    <tr>
        <th>class</th>
        <th>subjects</th>
        <th>Reports</th>
        </tr>
       
    <tr>
        <td>CSE</td>
        <td><a href="displaycse.jsp">Subject and Teachers</a></td>
        <td><a href="reportcse.jsp">classReport</a></td>
        
         </tr>
         <tr>
        <td>ECE</td>
        <td><a href="displayece.jsp">Subject And Teachers</a></td>
        <td><a href="reportece.jsp">classReport</a></td>
         </tr>
         <tr>
        <td>EEE</td>
        <td><a href="displayeee.jsp">Subject And Teachers</a></td>
        <td><a href="reporteee.jsp">class Report</a></td>
         </tr>
         
       


</table><br><br>


<form  align="center" action="logout.jsp">

<input type="submit" value="logout">
</form>

</body>
</html>