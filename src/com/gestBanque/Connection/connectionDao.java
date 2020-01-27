package com.gestBanque.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDao {
	
	private static  String jdbcUrl ="jdbc:mysql://localhost:3306/gestibankbdd1";
	private static  String jdbcUsername="root";
	private static  String jdbcPassword="root";
	private static  Connection jdbcConnection;
 
	// constructeur  de la class connection 
	public connectionDao( String jdbcUrl, String jdbcUsername,String jdbcPassword) {
		this.jdbcUrl = jdbcUrl;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	// function qui  permis de se connecte a chaque appel  dans les methode 
	public static Connection connection() throws SQLException{
		if(jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			
			jdbcConnection =DriverManager.getConnection(jdbcUrl,jdbcUsername,jdbcPassword);
		}
		return jdbcConnection;
	}
	
	
	public void deconnection() throws SQLException{
		if(jdbcConnection==null|| jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}

}
