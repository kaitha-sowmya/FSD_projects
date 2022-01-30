package com.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
    public Connection DBConn() throws ClassNotFoundException, SQLException{
    	
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","sowmya7287");
            return conn;
    }
    
}
    
    
//public static Connection dbcon() throws ClassNotFoundException, SQLException {
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	
//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcoperations","root","sowmya7287");
//      return con;


