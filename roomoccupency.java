import java.sql.*;



public class roomoccupency {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		int n;
		Class.forName("com.mysql.jdbc.Driver");
  
	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/roomoccupancylist","root","#shravani12345@nikitha");
	
	Statement statement =connection.createStatement();
	
	ResultSet resultset=statement.executeQuery("SELECT * FROM roomoccupancy");
    n=statement.executeUpdate("INSERT INTO roomoccupancy VALUES(1,4,7,3,2,3)");
    n=statement.executeUpdate("INSERT INTO roomoccupancy VALUES(2,5,8,2,1,4)");
	System.out.println(n);


	if(n>0)
	{
		System.out.println("successfully inserted");
	}else {
		System.out.println("Not inserted");
	}
	}
}
