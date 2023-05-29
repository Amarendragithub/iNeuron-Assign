package in.ineuron.main;
import java.sql.*;

public class Demo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Sanu@123");
			Statement stmt=con.createStatement();
			System.out.println("Inserting records");
			String sql="Insert into fruit values(43)";
			stmt.executeUpdate(sql);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
