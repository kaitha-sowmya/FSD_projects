<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
        String name = request.getParameter("user");
        String pwd = request.getParameter("pass");
        
        if (name.equals("sowmya") || pwd.equals("1234")) {
        	session.setAttribute("name", name);
                response.sendRedirect("Display.jsp");
               
                
                
        } else {
        	
                response.sendRedirect("index.jsp");
                
        }
%>

</body>
</html>