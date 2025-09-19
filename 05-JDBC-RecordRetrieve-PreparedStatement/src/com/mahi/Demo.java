package com.mahi;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Demo {

	public static final String driverClassName="com.mysql.cj.jdbc.Driver";
	public static final String url="jdbc:mysql:///JDBC";
	public static final String userName="root";
	public static final String password="1234";
	public static final String query ="insert into batch1am values(?,?,?)";
	
	public static void main(String[] args)throws Exception {

	Class.forName(driverClassName);
	Connection cn=DriverManager.getConnection(url,userName,password);
	PreparedStatement pr=cn.prepareStatement(query);
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.println("enter ID: ");
	int id = Integer.parseInt(br.readLine());
	
	System.out.println("enter name: ");
	String name=br.readLine();
	
	System.out.println("enter cource: ");
	String cource=br.readLine();
	
	pr.setInt(1, id);
	pr.setString(2, name);
	pr.setString(3, cource);

	
	int k=pr.executeUpdate();
	if (k>0) {
		System.out.println("record inserted");
	} else {
System.out.println("failed to  insert");
	}
	
}	
} 



