//DOCTORS FEES AND ADDITIONAL FEES PAYMENT
import java.sql.*;
public class doctorsfees {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		int n;
		Class.forName("com.mysql.jdbc.Driver");
  
	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/doctorsfees","root","harshi*2");
	
	Statement statement =connection.createStatement();
	
	ResultSet resultset=statement.executeQuery("SELECT * FROM doctorsfee");
    n=statement.executeUpdate("INSERT INTO doctorsfee VALUES('prakash',500,1000,100,1000,1500,2000)");
    n=statement.executeUpdate("INSERT INTO doctorsfee VALUES('vimala',500,1000,100,1000,1500,2000)");
    
	System.out.println(n);


	if(n>0)
	{
		System.out.println("successfully inserted");
	}else {
		System.out.println("Not inserted");
	}
	}
}
