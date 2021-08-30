package com.jorge.restaurantesdata.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	
	private final static String BD = "restaurante";
	private final static String URL = "jdbc:mysql://localhost:3306/"+BD;
	private final static String USER = "root";
	private final static String PASSWORD = "admin";
			
	private static Connection connection;
	private static Statement statement;
	
	public static Connection conectar() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(URL, USER, PASSWORD);		
		statement = connection.createStatement();
		return connection;
	}
	
	public static int ejecutarSQL(String sql) throws SQLException {
		System.out.println("Query: " + sql);
		return statement.executeUpdate(sql);
	}
	
	public static ResultSet ejecutarSQLSelect(String sql) throws SQLException {
		System.out.println("Query: " + sql);
		return statement.executeQuery(sql);
	}
}
