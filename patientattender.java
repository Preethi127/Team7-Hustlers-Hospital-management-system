import java.sql.*;
public class patientattender {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		int info;
		Class.forName("com.mysql.jdbc.Driver");
  
	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/patientattenderlist_db","root","#shravani12345@nikitha");
	
	Statement statement =connection.createStatement();
	
	ResultSet resultset=statement.executeQuery("SELECT * FROM patientattender");
	 info=statement.executeUpdate("INSERT INTO patientattender  VALUES('Shristi',233,37,'female','shri',10,'dfdd,ef,efe')");
	 info=statement.executeUpdate("INSERT INTO patientattender  VALUES('hevin',199,40,'male','kavi',04,'fef,de,fev')");
	 info=statement.executeUpdate("INSERT INTO patientattender  VALUES('ssss',402,42,'female','sahil',02,'cdvc,efcvv,eff')");  
	 info=statement.executeUpdate("INSERT INTO patientattender  VALUES('dddd',673,35,'female','maha',01,'vdfv,ev,vv')"); 
	System.out.println(info);


	if(info>0)
	{
		System.out.println("successfully inserted");
	}else {
		System.out.println("Not inserted");
	}
	}
}
