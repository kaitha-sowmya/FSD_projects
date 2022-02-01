<%@page import="java.sql.ResultSet"%>
<%@page import="com.la.bean.*"%>
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
<h1 align="center"> Subjects And Teachers</h1>
<%
Subjectcrud s=new Subjectcrud();
ResultSet rs=s.select();
%>
<table border=2 align="center">
    <tr>
        <th>Sl.No</th>
        <th>Subjects</th>
        <th>Teachers</th>
        <th>Action</th>
        </tr>
     <%  while(rs.next()){
	
	  %>

	  
	      <td> <%out.print(rs.getInt(1));%></td>
	      <td><%out.print(rs.getString(2));%></td> 
	      <td><%out.print(rs.getString(3));%></td> 
	      <td><a href="editsub.jsp">EDIT</a></td>
	      <td><a href="deletesub.jsp">DELETE</a></td>
	  </tr>
      
	
		
<%	
}
%>
</table><br><br>
      <form align="center" action="addsub.jsp">
      <input  type="submit" value="Add New Subject">
      </form><br><br>
      <a align="center" href="Display.jsp">RETURN TO MENU</a>
</body>
</html>