package com.no;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Demo {
public static final String driverClassName="com.mysql.cj.jdbc.Driver";
public static final String url="jdbc:mysql:///JDBC";
public static final String userName="root";
public static final String password="1234";
public static final String INSERT="INSERT INTO BATCH1AM VALUES(101,'vatsal','java-fullstack')";

	public static void main(String[] args) throws Exception{
    Class.forName(driverClassName);
    Connection con = DriverManager.getConnection(url, userName,password);
    Statement stm = con.createStatement();
    int m = stm.executeUpdate(INSERT);
    if (m>0) {
		System.out.println("Record Inserted");
	} else {
        System.out.println("Failed to Inserted");
	}
	}

}
