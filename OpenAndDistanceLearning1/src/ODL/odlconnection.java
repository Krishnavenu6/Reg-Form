package ODL;

import java.sql.*;

public class odlconnection {
	private static final String url = "jdbc:mysql://localhost:3306/user";
	private static final String userName = "root";
	private static final String passWord = "root";
	
	public static Connection getConnection() {
		try {
			return  DriverManager.getConnection(url,userName,passWord);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
