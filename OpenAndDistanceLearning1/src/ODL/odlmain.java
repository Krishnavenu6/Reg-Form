package ODL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class odlmain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
       Reg form=new Reg();
       System.out.println("-----Enter user Details------");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter name:");
       String x = sc.nextLine();
       form.setuname(x);
       
       System.out.println("Enter email:");
       String y = sc.nextLine();
	   form.setuemailid(y);
       
       
       System.out.println("Enter password:");
       String z = sc.nextLine();
	   form.setupassword(z);
       
       
       System.out.println("Enter gender:");
       String a = sc.nextLine();
	   form.setugender(a);
	   
	   //addding into database
	   
	   String query = "Insert into user1 values(?,?,?,?)";//Insert into user1 values("name",?,?,?)

		Connection con = odlconnection.getConnection();
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, form.getuname());
		pst.setString(2, form.getuemailid());
		pst.setString(3, form.getupassword());
		pst.setString(4, form.getugender());
		
		pst.executeUpdate();
	   

		   System.out.println("Details Registered successfully...");
	   showDetails();
	   
	}
//	   -------------------------

	   public static void showDetails() throws SQLException {
		   String query = "Select * from user1";
			Connection con = odlconnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println("Name : " + rs.getString(1));
				System.out.println("Mail : " + rs.getString(2));
				System.out.println("Pass : " + rs.getString(3));
				System.out.println("Gender : " + rs.getString(4));
				
			}
		   
	   }
}