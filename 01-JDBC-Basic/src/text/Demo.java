package text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Demo {
	private final static String driverClass ="com.mysql.cj.jdbc.Driver";
	private final static String url ="jdbc:mysql://localhost:3306/JDBC";
	private final static String userName ="root";
	private final static String password ="1234";
    private final static String inputQuery = "create table StudentData(id int primary key,name varchar(50),fees float";


public static void main(String[] args) throws Exception{
	
		Class.forName(driverClass);
		Connection con =DriverManager.getConnection(url,userName,password);
		Statement st=con.createStatement();
        if(con!=null) {
        	System.out.println("connection created");
        }else {
        	System.out.println("connection failed");
        }
	
		
		
		
		
		
		
	}

}
