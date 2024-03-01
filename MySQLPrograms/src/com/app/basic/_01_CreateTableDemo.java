package com.app.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _01_CreateTableDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boot7am", "root", "root");
		Statement st = con.createStatement();
		String sqlQuery = "create table employee(eno integer, ename varchar(10), esal double(10,2), eaddress varchar(10))";
		st.executeUpdate(sqlQuery);
		System.out.println("TABLE CREATED PLEASE VERIFY THE DATABASE");
		con.close();
	}
}
