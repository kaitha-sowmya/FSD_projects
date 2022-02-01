package com.la.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.la.bean.Classes;
import com.la.dbconnection.DBConnection;

public class Classcrud {

		public static ResultSet select() throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="select * from classlist";
			PreparedStatement ps=con.prepareStatement(sql);
			return ps.executeQuery();
			
		}

		
		public static int update(Classes b) throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="update classlist set cname=? where cid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, b.getCname());
			ps.setInt(2,b.getCid());
			return ps.executeUpdate();
			
			
		}
		public static int insert(Classes b) throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="insert into classlist values(?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, b.getCid());
			ps.setString(2, b.getCname());
			return ps.executeUpdate();	}
		
		
		public static int delete(Classes b) throws SQLException, ClassNotFoundException {
			Connection con=DBConnection.dbcon();
			String sql="delete from classlist where cid=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, b.getCid());
			return ps.executeUpdate();
		}
	}

