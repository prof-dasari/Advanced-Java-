package com.vtc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/vtc";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			String tableName;
			stmt = conn.createStatement();

			java.sql.ResultSetMetaData rsMetaData;
			ResultSet rsDBInfo;
			ResultSet rsTableInfo;

			DatabaseMetaData dbMetaData = conn.getMetaData(); // Connection MetaData
														// Information.
			rsDBInfo = dbMetaData.getTables(null, null, null,
					new String[] { "TABLE" }); // ResultSet of all tables

			while (rsDBInfo.next()) {
				tableName = rsDBInfo.getString("TABLE_NAME");
				System.out.println(" Table Name :: " + tableName);
				if (tableName != null) {
					rsTableInfo = stmt.executeQuery("Select * from "
							+ tableName);
					rsMetaData = rsTableInfo.getMetaData(); // Table MetaData
															// Information.

					for (int i = 1; i < rsMetaData.getColumnCount() + 1; i++) {
						System.out.print(" Column Name: "
								+ rsMetaData.getColumnName(i));
						System.out.println(", Column Type: "
								+ rsMetaData.getColumnType(i));
					}
					System.out.println();
				}
			}
		} catch (SQLException | ClassNotFoundException e) {
			// Handle errors for JDBC
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}// nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}// end finally try
		}

	}

}
