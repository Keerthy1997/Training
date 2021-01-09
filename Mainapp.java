package cumm;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
public class Mainapp { 
public static void main(String[] args)throws SQLException { 

// TODO Auto-generated method stub 

try { 
Class.forName("com.mysql.cj.jdbc.Driver"); 
System.out.println("Driver loaded succesfully"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_DB","root","root"); 
System.out.println("Database connected succesfully"); 
Statement st=con.createStatement(); 
ResultSet rset=st.executeQuery("select *from Employee_info"); 
while(rset.next()) { 
System.out.println("emp_id="+rset.getInt(1)); 
System.out.println("emp_name="+rset.getNString(2)); 
System.out.println("emp_age="+rset.getInt(3)); 
System.out.println("emp_desig="+rset.getNString(4)); 

 

} 

} 

catch(ClassNotFoundException e) { 

e.printStackTrace(); 

} 

}
}