package com.no;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Demo {
public static final String driverClassName="com.mysql.cj.jdbc.Driver";
public static final String url="jdbc:mysql:///JDBC";
public static final String userName="root";
public static final String password="1234";
public static final String select="";

	public static void main(String[] args) throws Exception{
    Class.forName(driverClassName);
    Connection con = DriverManager.getConnection(url, userName,password);
   
	}

}
