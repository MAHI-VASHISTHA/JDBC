package com.text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class Demo {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  con =DriverManager.getConnection("jdbc:mysql:///JDBC","root","1234");

		
if(con!=null) {
	System.out.println("connection created");
	}
else{
	System.out.println("can not connected");

}
	}
	}		
	
	
