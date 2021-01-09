package cum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveDemo {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		try {

Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Driver loaded succesfully");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");
System.out.println("Database connected succesfully");
Statement st=con.createStatement();
//int records=st.executeUpdate("insert into customers values(103,'reena',448,'bag',780)");
//System.out.println("Record inserted"+records);

PreparedStatement preparedStmt = con.prepareStatement("insert into customers values(?,?,?,?,?)");

preparedStmt.setInt   (1,104);
preparedStmt.setString(2, "Freddy");
preparedStmt.setInt   (3,449);
preparedStmt.setString(4, "wallet");
preparedStmt.setInt   (5,890);
System.out.println("Record inserted"+preparedStmt);
ResultSet rset=st.executeQuery("select *from customers");

while(rset.next()) {
	System.out.println("cust_id="+rset.getInt(1));
	System.out.println("cust_name="+rset.getNString(2));
	System.out.println("order_id="+rset.getInt(3));
	System.out.println("order_item="+rset.getNString(4));
	System.out.println("cust_no="+rset.getInt(5));
	
}

		}
		catch(ClassNotFoundException e) {
e.printStackTrace();
}
		
	}

}



