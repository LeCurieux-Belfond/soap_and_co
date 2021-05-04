package fr.myproject.java.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;



public class FabriqueConnexion {

//	 Attribut static(attribut de classe)
	private static Connection cnn = null;
	
//	Constructor privé (pour que 
	private FabriqueConnexion()
	{
		
	}
	
	public static Connection getConnexion() throws SQLException
	{
		if (cnn == null)
		{
			
			MysqlDataSource datasource = new MysqlDataSource();
				datasource.setServerName("localhost");
				datasource.setPortNumber(3306);
				datasource.setDatabaseName("savonnerie");
				datasource.setUser("root");
				datasource.setPassword("");
				
		try 
		{
			cnn = datasource.getConnection();
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		}
		
		return cnn;
		
	}
	
}
