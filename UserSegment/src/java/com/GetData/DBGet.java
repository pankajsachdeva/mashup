/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GetData;
import java.sql.*;
/**
 *
 * @author pankaj
 */
public class DBGet {
    String username;
		String password;
		Statement statement;
		Connection conn;
		ResultSet rs;
		
		public ResultSet getDB(double lat,double lon,int radius)
		{
			username="root";
			password="pankaj14";
			double var1=lat-radius;
                        double var2=lat+radius;
                        double var3=lon-radius;
                        double var4=lon+radius;
			try{
			//loading a driver
				Class.forName("com.mysql.jdbc.Driver");
				
			//connecting to a database
				conn=DriverManager.getConnection("jdbc:mysql://localhost/Mashup",username,password);
				//System.out.println("Opening a conncetion");

				statement=conn.createStatement();			
				rs=statement.executeQuery("select * from Mashup.userInstallData where latitude between "+var1+" and "+var2+", longitude between "+var3+" and "+var4+";");
                                
					
			}
			catch(Exception ex){}
		return rs;	
		}
    
}
