package com.la.crud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.la.bean.Teacher;
import com.la.dbconnection.DBConnection;

public class Teachercrud {
	public static ResultSet display() throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="select * from teacherlist";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();	
	}

	public static int insert( Teacher b) throws ClassNotFoundException, SQLException {
	Connection con=DBConnection.dbcon();
	String sql="insert into teacherlist values(?,?,?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getTid());
	ps.setString(2, b.getFirstname());
	ps.setString(3, b.getLastname());
	ps.setDate(4,new java.sql.Date(b.getDOB().getTime()));
	ps.setString(5,b.getAddress());
	ps.setInt(6, b.getPhone());
	ps.setString(7,b.getDesignation());
	return ps.executeUpdate();	
	}
	public static int update(Teacher b) throws ClassNotFoundException, SQLException {
	Connection con=DBConnection.dbcon();
	String sql="update teacherlist set firstname=?, lastname=?, dob=?, address=?, phone=?, designation=? where tid=?" ;
	PreparedStatement ps=con.prepareStatement(sql);

	ps.setString(1, b.getFirstname());
	ps.setString(2, b.getLastname());
	ps.setDate(3,(Date) new java.util.Date(b.getDOB().getTime()));
	ps.setString(4,b.getAddress());
	ps.setInt(5, b.getPhone());
	ps.setString(6,b.getDesignation());
	ps.setInt(7, b.getTid());
	return ps.executeUpdate();	
	}
	public static int delete( Teacher b) throws ClassNotFoundException, SQLException {
	Connection con=DBConnection.dbcon();
	String sql="delete from teacherlist  where tid=?" ;
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getTid());
	return ps.executeUpdate();	
	}
	}

