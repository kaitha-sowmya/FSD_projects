package com.la.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.la.bean.CSE;
import com.la.dbconnection.DBConnection;

public class Csecrud {
	public static ResultSet display() throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="select * from CSE";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		}
	
	public static int insert(CSE b) throws ClassNotFoundException, SQLException {
	Connection con=DBConnection.dbcon();
	String sql="insert into CSE values(?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getCid());
	ps.setString(2, b.getSubject());
	ps.setString(3, b.getTeacher());
	return ps.executeUpdate();	
	}
	
public static int delete(CSE b) throws ClassNotFoundException, SQLException {
	Connection con=DBConnection.dbcon();
	String sql="delete from CSE where cid=?";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getCid());
	return ps.executeUpdate();	
	}
}

