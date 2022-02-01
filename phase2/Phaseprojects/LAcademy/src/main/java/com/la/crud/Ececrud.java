package com.la.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.la.bean.ECE;
import com.la.dbconnection.DBConnection;

public class Ececrud {
		public static ResultSet display() throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="select * from ECE";
			PreparedStatement ps=con.prepareStatement(sql);
			return ps.executeQuery();
			}
		
		public static int insert(ECE b) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="insert into ECE values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getCid());
		ps.setString(2, b.getSubject());
		ps.setString(3, b.getTeacher());
		return ps.executeUpdate();	
		}
		
	public static int delete(ECE b) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="delete from ECE where cid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getCid());
		return ps.executeUpdate();	
		}
	}
