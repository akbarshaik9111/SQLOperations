package com.app.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _02_DropTableDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boot7am", "root", "root");
		Statement st = con.createStatement();
		String sqlQuery = "drop table employee";
		st.executeUpdate(sqlQuery);
		System.out.println("TABLE DELETED SUCCESSFULLY");
		con.close();
	}
}
