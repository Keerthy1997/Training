package cumm;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
public class UniquevalueDemo { 
public static void main(String[] args)throws SQLException { 

// TODO Auto-generated method stub 

try { 
Class.forName("com.mysql.cj.jdbc.Driver"); 
System.out.println("Driver loaded succesfully"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_DB","root","root"); 
System.out.println("Database connected succesfully"); 
Statement stmt = con.createStatement();
String query = "select emp_age from Employee_info";
ResultSet rs = stmt.executeQuery(query);
System.out.println("Ages:");
while (rs.next()) {
int count = rs.getInt(1);
System.out.println(""+count);


}

} 

catch(ClassNotFoundException e) { 

e.printStackTrace(); 

} 

}
}





