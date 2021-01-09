package cumm;
 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
public class CountDemo { 
public static void main(String[] args)throws SQLException { 

// TODO Auto-generated method stub 

try { 
Class.forName("com.mysql.cj.jdbc.Driver"); 
System.out.println("Driver loaded succesfully"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_DB","root","root"); 
System.out.println("Database connected succesfully"); 
Statement stmt = con.createStatement();
String query = "select count(*) from Employee_info where emp_desig='HR'";
ResultSet rs = stmt.executeQuery(query);
rs.next();
int count = rs.getInt(1);
System.out.println("Number of HR: "+count);


 

} 

catch(ClassNotFoundException e) { 

e.printStackTrace(); 

} 

}
}


