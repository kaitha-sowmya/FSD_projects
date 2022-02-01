package com.la.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.la.bean.Subject;
import com.la.dbconnection.DBConnection;

public class Subjectcrud {
	public static ResultSet select() throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="select * from subjectlist";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();
		
	}

	
	public static int update(Subject b) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="update subjectlist set subname=?,teacher=? where subid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, b.getSubname());
		ps.setString(2, b.getTeacher());
		
		ps.setInt(3,b.getSubid());
		return ps.executeUpdate();
		
		
	}
	public static int insert(Subject b) throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="insert into subjectlist values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getSubid());
		ps.setString(2, b.getSubname());
		ps.setString(3, b.getTeacher());
		return ps.executeUpdate();	
		}
	
	
	public static int delete(Subject b) throws SQLException, ClassNotFoundException {
		Connection con=DBConnection.dbcon();
		String sql="delete from subjectlist where subid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, b.getSubid());
		return ps.executeUpdate();
	}
}