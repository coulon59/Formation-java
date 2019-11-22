package com.smile.maven_demo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOGGER = Logger.getLogger(App.class);
	public static void main( String[] args ) throws SQLException
    {
        //LOGGER.info("Hello World");
        //LOGGER.debug("ok");
        
       /* String user = "root";
        String password = "root";
        Connection connexion = null;
        Statement statement = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/banque?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        
        try {
        	
            Class c = Class.forName("com.mysql.cj.jdbc.Driver");
            Driver driver = (Driver)c.newInstance();
           // DriverManager.registerDriver(driver);
            connexion = DriverManager.getConnection(url, user, password);
            statement = connexion.createStatement();
            
            rs = statement.executeQuery("SELECT * FROM utilisateur");
            while (rs.next()) {
            	System.out.println(rs.getString("nom"));	
            }
           
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
        	if (rs != null) {
        		rs.close();
        	}
        	if (statement !=null) {
	        	statement.close();
        	}
        	if (connexion != null) {
        		connexion.close();
        	}
        }
        
    }
	
	//public static int div(int a, int b) {
		//return a/b;*/
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(1);
		for (int i : set) {
			System.out.println(i);
		}
		
    }
	
}
