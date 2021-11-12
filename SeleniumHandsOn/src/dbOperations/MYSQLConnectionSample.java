package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLConnectionSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection connection=DriverManager.
				getConnection("jdbc:mysql://root@localhost/selenium_mysql");

	    Statement statement=connection.createStatement();
	    
	    ResultSet result=statement.executeQuery("SELECT * FROM login_table");
	
	    while(result.next())
	    {
	    	System.out.println("username:"+ result.getString(1)+
	    	" "+"password:"+result.getString(2)+
	    	" " +"user_id:"+ result.getInt(3));
	    }
	}

}
