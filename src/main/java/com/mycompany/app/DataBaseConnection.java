package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

	public static void main(String[] args) throws SQLException {
		
		String host="localhost";
		String port="3306";
		String databasename="QATestDB";
		String url="jdbc:mysql://"+host+":"+ port +"/"+databasename;
		Connection connection=DriverManager.getConnection(url, "root", "Jaimatadi123$$");
		Statement s=connection.createStatement();
		ResultSet res=s.executeQuery("Select * from loginCredentials");
		res.next();
		
	System.out.println(res.getString("username"));	
	System.out.println(res.getString("password"));	

	}

}
