package com.mahi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Demo {

	public static final String driverClassName = "com.mysql.cj.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/JDBC";
	public static final String userName = "root";
	public static final String password = "1234";

	public static final String getAllData = "select * from batch1am";
	public static final String getByid = "select * from batch1am where id=?";
	public static final String insert = "insert into batch1am values(?,?,?)";
	public static final String update = "update batch1am set name=?,cource=? where id=?";
	public static final String delete = "delete from batch1am where id=?";

	public static void main(String[] args) throws Exception {

		Class.forName(driverClassName);
		Connection con = DriverManager.getConnection(url, userName, password);

		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);

		PreparedStatement ps1 = con.prepareStatement(getAllData);
		PreparedStatement ps2 = con.prepareStatement(getByid);
		PreparedStatement ps3 = con.prepareStatement(insert);
		PreparedStatement ps4 = con.prepareStatement(update);
		PreparedStatement ps5 = con.prepareStatement(delete);

		loop: while (true) {
			System.out.println("************please select an option*************");
			System.out.println("1.see All Records");
			System.out.println("2.see specific student record ");
			System.out.println("3.add new student record");
			System.out.println("4.update student record");
			System.out.println("5.delete student record");
			System.out.println("6.exit \n\n");

			System.out.println("enter your choice :: ");
			String choice = br.readLine();

			switch (choice) {
			case "1": {
				ResultSet rs = ps1.executeQuery();

				while (rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
				}

			}
				break;
			case "2": {
				System.out.println("Enter your id :");
				int id = Integer.parseInt(br.readLine());

				ps2.setInt(1, id);
				ResultSet rs = ps2.executeQuery();

				if (rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));

				}
			}
				break;
			case "3": {
				System.out.println("enter ID: ");
				int id = Integer.parseInt(br.readLine());

				System.out.println("enter name: ");
				String name = br.readLine();

				System.out.println("enter cource: ");
				String cource = br.readLine();

				ps3.setInt(1, id);
				ps3.setString(2, name);
				ps3.setString(3, cource);

				int k = ps3.executeUpdate();
				if (k > 0) {
					System.out.println("record inserted");
				} else {
					System.out.println("failed to  insert");
				}
			}
				break;
			case "4": {
				System.out.println("enter your id :");
				int id = Integer.parseInt(br.readLine());

				ps2.setInt(1, id);
				ResultSet rs = ps2.executeQuery();

				if (rs.next()) {
					System.out.println("old name :" + rs.getString(2));

					System.out.println("Enter new name");
					String name = br.readLine();

					System.out.println("old course :" + rs.getString(3));

					System.out.println("Enter new course");
					String course = br.readLine();

					ps4.setString(2, name);
					ps4.setString(3, course);

					int k = ps4.executeUpdate();
					if (k > 0) {
						System.out.println("Record Updated");
					} else {
						System.out.println("Not Updated");
					}

				} else {
					System.out.println("data not found");
				}

			}
				break;
			case "5": {
				System.out.println("enter your id :");
				int id = Integer.parseInt(br.readLine());

				ps2.setInt(1, id);
				ResultSet rs = ps2.executeQuery();

				if (rs.next()) {
					ps5.setInt(1, id);

					int k = ps5.executeUpdate();
					if (k > 0) {
						System.out.println("record deleted");
					} else {
						System.out.println("record not deleted");
					}
				}
			}
				break;
			case "6": {
				break loop;
			}

			default: {
				System.out.println("Invalid input");
			}

			}
		}

	}

}
