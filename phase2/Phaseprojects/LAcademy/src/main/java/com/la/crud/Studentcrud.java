package com.la.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.la.bean.Student;
import com.la.dbconnection.DBConnection;

public class Studentcrud {

	public static ResultSet display() throws ClassNotFoundException, SQLException {
		Connection con=DBConnection.dbcon();
		String sql="select * from studentlist";
		PreparedStatement ps=con.prepareStatement(sql);
		return ps.executeQuery();	
	}

	public static int insert( Student b) throws ClassNotFoundException, SQLException {
	Connection con=DBConnection.dbcon();
	String sql="insert into studentlist values(?,?,?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getSid());
	ps.setString(2, b.getFirstname());
	ps.setString(3, b.getLastname());
	ps.setDate(4,new java.sql.Date(b.getDOB().getTime()));
	ps.setString(5,b.getAddress());
	ps.setInt(6, b.getPhone());
	ps.setString(7,b.getClassname());
	return ps.executeUpdate();	
	}
	public static int update( Student b) throws ClassNotFoundException, SQLException {
	Connection con=DBConnection.dbcon();
	String sql="update studentlist set firstname=?, lastname=?, dob=?, address=?, phone=?, classname=? where sid=?" ;
	PreparedStatement ps=con.prepareStatement(sql);

	ps.setString(1, b.getFirstname());
	ps.setString(2, b.getLastname());
	ps.setDate(3,new java.sql.Date(b.getDOB().getTime()));
	ps.setString(4,b.getAddress());
	ps.setInt(5, b.getPhone());
	ps.setString(6,b.getClassname());
	ps.setInt(7, b.getSid());
	return ps.executeUpdate();	
	}
	public static int delete( Student b) throws ClassNotFoundException, SQLException {
	Connection con=DBConnection.dbcon();
	String sql="delete from studentlist  where sid=?" ;
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, b.getSid());
	return ps.executeUpdate();	
	}
	}