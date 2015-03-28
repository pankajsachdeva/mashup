package com.GetData;

import java.sql.*;

public class DBStore
{
	String username;
	String password;
	Statement statement;
	Connection conn;
	ResultSet rs;
	
	public void DBStorer(int userId, double latitude,double longitude)
	{
		username="root";
		password="pankaj14";
		
		try{

			Class.forName("com.mysql.jdbc.Driver");			
			conn=DriverManager.getConnection("jdbc:mysql://localhost/Mashup",username,password);
					
		//issuing statements
			//statement=conn.createStatement();
		
			 String sql = "INSERT INTO userInstallData (userId, latitude, longitude) values (?, ?, ?)";
			 PreparedStatement statement = conn.prepareStatement(sql);
			 statement.setInt(1,userId);
			 statement.setDouble(2,latitude);
			 statement.setDouble(3,longitude);
			 statement.executeUpdate();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	
	}
}
	
