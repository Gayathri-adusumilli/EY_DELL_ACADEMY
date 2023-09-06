package com.programming.class_13;

import java.sql.*;

public class PreparedStatementAPI {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {

			String dbURL = "jdbc:mysql://localhost:3306/hplus?user=root&password=1701@November";

			conn = DriverManager.getConnection(dbURL);

			if (conn != null) {

				System.out.println("Connection establised using connection");

			}

			String query = "UPDATE emp_table SET empname =? WHERE empno =?";
			ps = conn.prepareStatement(query);
			ps.setString(1, "Gayathri");
			ps.setInt(2, 7001);

			int rows = ps.executeUpdate();
			

			if(rows != 0) {
				System.out.println("Upadate completed successfully!");
			} else {
				System.out.println("Upadate could not be done.");
			}
			String selectQuery = "SELECT * FROM emp_table WHERE empno = ?";
			ps = conn.prepareStatement(selectQuery);
			ps.setInt(1, 7001);
			

			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
