<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.la.crud.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"> Subjects And Teachers</h1>
<%
Ececrud c=new Ececrud();
ResultSet rs=Ececrud.display();
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
	      <td><a href="deleteece.jsp">DELETE</a></td>
	  </tr>
      	
		
<%	
}
%>
</table><br><br>
<form action="addclassbe.jsp" align="center">
<input type="submit" value="ADD SUBJECT">

</form><br><br>
<a align="center" href="Display.jsp">RETURN TO MENU</a>
</body>
</html>