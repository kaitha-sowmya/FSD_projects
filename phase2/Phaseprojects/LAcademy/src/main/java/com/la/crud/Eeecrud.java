package com.la.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.la.bean.EEE;
import com.la.dbconnection.DBConnection;

public class Eeecrud {


		public static ResultSet display() throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="select * from EEE";
			PreparedStatement ps=con.prepareStatement(sql);
			return ps.executeQuery();
			}
		
		public static int insert(EEE b) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="insert into EEE values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getCid());
		ps.setString(2, b.getSubject());
		ps.setString(3, b.getTeacher());
		return ps.executeUpdate();	
		}
		
	public static int delete(EEE b) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="delete from EEE where Cid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getCid());
		return ps.executeUpdate();	
		}
	}