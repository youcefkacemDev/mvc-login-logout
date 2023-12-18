package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	private static String server_name = "jdbc:mysql://localhost/mvc";
	private static String server_user = "root";
	private static String server_password = "";
	private static Connection connect;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(server_name, server_user, server_password);
		}catch(Exception e) {
			System.out.println("connection failed :");
			e.printStackTrace();
		}
	}
	
	public static Connection connect() {
		return connect;
	}
}
