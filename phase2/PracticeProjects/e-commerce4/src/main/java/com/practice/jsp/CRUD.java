package com.practice.jsp;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class CRUD {
		public ResultSet Retrieve(ProductDetails p) throws ClassNotFoundException, SQLException {
			String sql="select * from eproduct where ID=?";
			Connection con=DbConnection.DBconn();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, p.getPid());
			return ps.executeQuery();
			
		}

	}

