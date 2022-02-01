package com.la.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.la.dbconnection.DBConnection;

public class classreport {
	
		public static ResultSet displaycse() throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="select * from CSE";
			PreparedStatement ps=con.prepareStatement(sql);
			return ps.executeQuery();
			}
		public static ResultSet displaycsestudent() throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="select * from studentlist where classname='CSE'";
			PreparedStatement ps=con.prepareStatement(sql);
			return ps.executeQuery();
			}
		public static ResultSet displayece() throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="select * from ECE";
			PreparedStatement ps=con.prepareStatement(sql);
			return ps.executeQuery();
			}
		public static ResultSet displayecestudent() throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="select * from studentlist where classname='ECE'";
			PreparedStatement ps=con.prepareStatement(sql);
			return ps.executeQuery();
			}



		public static ResultSet displayeee() throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="select * from EEE";
			PreparedStatement ps=con.prepareStatement(sql);
			return ps.executeQuery();
			}
		public static ResultSet displayeeestudent() throws ClassNotFoundException, SQLException {
			Connection con=DBConnection.dbcon();
			String sql="select * from studentlist where classname='EEE'";
			PreparedStatement ps=con.prepareStatement(sql);
			return ps.executeQuery();
			}
}
