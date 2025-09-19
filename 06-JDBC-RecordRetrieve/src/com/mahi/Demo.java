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
		public static final String insert="insert into batch1am values(101 ,'vatsal sharma','java fullstack')";

	 public static void main (String[] args) throws Exception{

	Class.forName(driverClassName);
	Connection  con =DriverManager.getConnection(url,userName,password);
	
	Statement stm = con.createStatement();	
	int k = stm.executeUpdate(insert);
	if (k>0) {
		System.out.println("Data inserted");

	} else {
System.out.println("failed to inserted");
	}
	
} 
}


