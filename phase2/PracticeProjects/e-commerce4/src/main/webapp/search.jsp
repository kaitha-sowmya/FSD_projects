<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.practice.jsp.ProductDetails"%>
    <%@page import="com.practice.jsp.CRUD"%>
    <%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
ProductDetails pd=new ProductDetails();
pd.setPid(Integer.parseInt(request.getParameter("pid")));
CRUD c=new CRUD();
ResultSet rs=c.Retrieve(pd);
if(rs!=null){
out.print("pid       productname            price        date");%>
<br>
<% 
while(rs.next()){
out.print(rs.getInt(1)+"    "+rs.getString(2)+"       "+rs.getDouble(3)+"    "+rs.getDate(4));
}
}
else{
	out.print("No Item Available");
}
%>

</body>
</html>

