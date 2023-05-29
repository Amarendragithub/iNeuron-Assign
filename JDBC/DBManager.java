package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager {
	
		private String driver = "com.mysql.jdbc.Driver";
		private String url = "jdbc:mysql://localhost:3306/crud";
		private String uid = "root";
		private String passwd = "Sanu@123";
		
		public void selectRecords() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url , uid ,passwd);
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("Select*from student");
			
			while(result.next()) {
				System.out.println("SID = "+result.getInt(1));
				System.out.println("Student Name = "+result.getString(2));
				System.out.println("Student RegdNo = "+result.getString(3));
				System.out.println("Student Mob = "+result.getString(4));
				System.out.println("=========================="); 	
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
		public boolean ReccordManipulation(String query) {
			boolean flag = false;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url , uid ,passwd);
				Statement stmt = con.createStatement();
				flag = stmt.executeUpdate(query) > 0 ? true : false ;
				con.close();

			}
			catch(Exception e) {
				System.out.println(e);
			}
			return flag;
		}

}
