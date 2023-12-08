package ODL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class RegDao {
	public void displayRegInfo() throws SQLException {
		String query = "Select * from user";
		Connection con = odlconnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
	}


	
	
	
}



