package ChallengeExcercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RemoveUser {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		
				
		String Url = "jdbc:sqlserver://vm-cloud-sql;DatabaseName=dhs_demo_dev;user=dhsdemo;Password=$Pin1234";
        
		
		try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Trying to connect");
            Connection connection = DriverManager.getConnection(Url);

            System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                    + connection.getMetaData().getDatabaseProductName());
            
            // Delete User Name
           PreparedStatement qry = connection.prepareStatement ("delete from users where [First] like '%test%'");
          // qry.setString(1, userName);
           qry.executeUpdate();
           connection.commit();
           System.out.println("Query executed succesfully.");
           
           if (connection != null){
       		connection.close();
           }
            
        } catch (Exception e) {
        	System.out.println("Unable to make connection with DB");
            e.printStackTrace();
        } 
     
    
		}
		
	}

