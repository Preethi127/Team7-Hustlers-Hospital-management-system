import java.sql.*;
import java.util.Scanner;

public class Hospitalmanagementsystem 
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException 
	{
	
		int n;
		Class.forName("com.mysql.jdbc.Driver");
  
	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/doctorlist_db","root","preethi@2003");
	
	Statement statement =connection.createStatement();
	
	ResultSet resultset=statement.executeQuery("SELECT * FROM doctorlist");
    n=statement.executeUpdate("INSERT INTO doctorlist VALUES('dr.abhi','ENT',12,20,'Female',768634)");
    n=statement.executeUpdate("INSERT INTO doctorlist VALUES('dr.ananya','surgeon',34,22,'Female',86454)");
    n=statement.executeUpdate("INSERT INTO doctorlist VALUES('dr.Maya','gynaecologist',10,17,'Female',96782)");
    
	System.out.println(n);
	
	if(n>0)
	{
		System.out.println("successfully inserted");
	}else {
		System.out.println("Not inserted");
	}
      
	}
}
        
       