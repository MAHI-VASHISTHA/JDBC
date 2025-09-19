package com.mahi;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Demo {

		public static final String driverClassName="com.mysql.cj.jdbc.Driver";
		public static final String url ="jdbc:mysql://localhost:3306/JDBC";
		public static final String userName="root";
		public static final String password="1234";
		public static final String CREATE="CREATE TABLE BATCH1AM(ID INT , NAME VARCHAR(50) , COURCE VARCHAR(20))";

	 public static void main (String[] args) throws Exception{

	Class.forName(driverClassName);
	Connection  con =DriverManager.getConnection(url,userName,password);
	
	Statement stm = con.createStatement();	
	int k = stm.executeUpdate(CREATE);
	System.out.println("Table Created");
	
} 
}


