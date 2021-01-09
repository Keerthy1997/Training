package cum;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		try {

Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded succesfully");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");
System.out.println("Database connected succesfully");
Statement st=con.createStatement();
int records=st.executeUpdate("insert into customers values(104,'nikitha',449,'wallet',980)");
System.out.println("Record inserted"+records);

Statement st1=con.createStatement();
PreparedStatement pst=(PreparedStatement)con.prepareStatement("update customers set cust_name=? where cust_id=?");
		pst.setString(1,"tom");
		pst.setInt(2,104);
		pst.executeUpdate();
		
		

		}
		catch(ClassNotFoundException e) {
e.printStackTrace();
}
		
	
	}
}
