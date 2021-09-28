package database;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.ResultSet;


public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String URL = "jdbc:mysql://localhost:3306/ecommerce" ;
		String username = "root";
		String password = "root";
		
		DBconnection dbObj = new DBconnection(URL,username,password);
		
		Statement statement = dbObj.getConnection().createStatement();
		
		CallableStatement statement1 = dbObj.getConnection().prepareCall("{call add_product(?, ?)}");
		//statement.executeUpdate("insert into eproduct (name, price, date_added) values('mobile',9000.00,now())");
		
		//statement.executeUpdate("create database mydatabase");
		//statement.executeUpdate("drop database mydatabase");
		//statement.executeUpdate("update eproduct set ID=3 where name='mobile'");
		
		
		statement1.setString(1, "Washing Machine");
        statement1.setInt(2, 5000);
        
        statement1.executeUpdate();
		
		ResultSet result = statement.executeQuery("select * from eproduct");
		
		while(result.next()) {
			
			System.out.println("ID: " + result.getString("ID"));
			System.out.println("Name: " + result.getString("name"));
		}
			

		dbObj.closeConnection();	
	}
}
