import java.sql.*;

public class listofpatients {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		int n;
		Class.forName("com.mysql.jdbc.Driver");
  
	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/listofpatients_db","root","#shravani12345@nikitha");
	
	Statement statement =connection.createStatement();
	
	ResultSet resultset=statement.executeQuery("SELECT * FROM patientlist");
	 n=statement.executeUpdate("INSERT INTO patientlist  VALUES('Shrsh',23,'Female','allergy','A+',2335456,'ashhd,de,,wejwudhhb')");
	 n=statement.executeUpdate("INSERT INTO patientlist  VALUES('abcd',19,'male','fracture','B-',3445565,'dcd,rr,rfv')");
	 n=statement.executeUpdate("INSERT INTO patientlist  VALUES('siva',40,'male','fever','O+',2364543,'sddf,tyr,ed')");  
	 n=statement.executeUpdate("INSERT INTO patientlist  VALUES('susi',67,'female','kidneyfailure','A-',78677556,'df,rgtr,dcdc')"); 
	System.out.println(n);


	if(n>0)
	{
		System.out.println("successfully inserted");
	}else {
		System.out.println("Not inserted");
	}
	}

}
