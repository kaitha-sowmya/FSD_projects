<%@page import="java.sql.ResultSet"%>
<%@page import="com.la.crud.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">TEACHER LIST</h1>
<%

ResultSet rs=Teachercrud.display();
%>
<table align="center" border=2>
    <tr>
        <th>T ID</th>
        <th>FIRST NAME</th>
         <th>LAST NAME</th>
        <th>DATE OF BIRTH</th>
        <th>ADRESS</th>
        <th>PHONE NUMBER</th>
        <th>DESIGNATION</th>
           <th>Action</th>
        </tr>
     <%  while(rs.next()){
	
	  %> 
	      <td> <%out.print(rs.getInt(1));%></td>
	      <td><%out.print(rs.getString(2));%></td> 
	      <td><%out.print(rs.getString(3));%></td> 
	      <td><%out.print(rs.getDate(4));%></td>
	      <td><%out.print(rs.getString(5));%></td>
	      <td><%out.print(rs.getLong(6));%></td>
	      <td><%out.print(rs.getString(7));%></td>    
	      <td><a href="editT.jsp">EDIT</a></td>
	       <td><a href="deleteT.jsp">DELETE</a></td>
	      </tr>	
<%	
}
%>
</table><br><br>
<form align="center" action="addT.jsp">
<input type="submit" value="ADD TEACHER">


</form>


<br><br>
<a align="center" href="Display.jsp">RETURN TO MENU</a>
</body>
</html>