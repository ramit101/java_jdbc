package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String[] args) {
		
		
		try {
			//make connection with database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/twfmp","root","root");
			
			//execute query
			Statement stat = con.createStatement();
			stat.executeUpdate("insert into student values('stallin','stallin@gmail.com','981820203')");
			
			//close connection
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}

}
