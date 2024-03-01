package com.app.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _03_InsertSingleRowData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/boot7am", "root", "root");
		Statement stmt = con.createStatement();
		String sqlQuery = "insert into employee values(01, 'Akbar', 15000.0, 'BVM')";
		int updateCount = stmt.executeUpdate(sqlQuery);
		System.out.println("THE NUMBER OF RECORDS INSERTED: "+updateCount);
		con.close();
	}
}
