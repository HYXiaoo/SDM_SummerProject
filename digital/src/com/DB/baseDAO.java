package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class baseDAO {
	protected static Connection conn;
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("DatabaseDriver not found");
		}
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/digital?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC","root","123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connecting to database failed");
		}
	}
	protected PreparedStatement stmt;
	protected ResultSet rSet;
	
	public static void closeConn(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeTemps(){
		try {
			if(stmt!=null) stmt.close();
			if(rSet!=null) rSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
