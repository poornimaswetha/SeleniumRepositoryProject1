package InterviewJDBCMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MySqlConnect {

	public static void main(String[] args) throws SQLException {
		// Connect to mysql database
		Connection connection=DriverManager.getConnection("jdbc:Mysql://localhost:3306/poornimadb","root","poornima");
				
		if(!connection.isClosed()) {
			System.out.println("MySQL is successfully connected to database");
			
		// To create statement and query
			Statement statement=connection.createStatement();
			ResultSet resultset= statement.executeQuery("Select * from Employees where id=4;");
			
			while(resultset.next()) {
				System.out.println(resultset.getInt("id"));
				System.out.println(resultset.getString("name"));
				System.out.println(resultset.getString("place"));
				System.out.println(resultset.getInt("experience"));
			}
		}

	}

}
