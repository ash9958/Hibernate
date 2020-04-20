package com.ashish.classic;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
//import java.sql.SQLException;



public class MyJDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels","root","");) {
			
			
			
//			Statement stmt = conn.createStatement();
//			ResultSet rs  = stmt.executeQuery("select * from employees");
//			whiles(rs.next())
//			{
//				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +rs.getString(3) );
//			}
			
			System.out.println("satrted");
		
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
