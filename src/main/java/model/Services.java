package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DAO.Connect;
import DAO.User;

public class Services {
	public static void add(User user) {
		try {
			String SQL = ("INSERT INTO users(fname, lname, phone, username, pwd, email, gender) VALUES(?, ?, ?, ?, ?, ?, ?);");
			PreparedStatement ps = Connect.connect().prepareStatement(SQL);
			ps.setString(1, user.getFirstname());
			ps.setString(2, user.getLastname());
			ps.setString(3, user.getPhoneNumber());
			ps.setString(4, user.getUsername());
			ps.setString(5, user.getPassword());
			ps.setString(6, user.getEmail());
			ps.setString(7, user.getGender());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e) {
			System.out.println("insert user faied :");
			e.printStackTrace();
		}
	}
	
	public static boolean check(String username, String password) {
		boolean status = false;
		try {
			String SQL = ("SELECT * FROM users WHERE username = ? and pwd = ?;");
			PreparedStatement ps = Connect.connect().prepareStatement(SQL);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet result = ps.executeQuery();
			if(result.next()) {
				return status = true;
			}
		}catch(Exception e) {
			System.out.println("password uncorect");
			e.printStackTrace();
		}
		return status;
	}
}