import java.util.Scanner;
class Assignment{
 public static void main(String arg[])
{System.out.println("Menu driven option for my company");
int press=1;
String ID=" ";
String name=" ";
String designation=" ";

switch(press)
{ case 1: System.out.println("Enter employee ID");
Scanner sc1= new Scanner(System.in);
 ID= sc1.next();

System.out.println("Enter employee name");
Scanner sc2= new Scanner(System.in);
name= sc2.next();

System.out.println("Designation");
Scanner sc3= new Scanner(System.in);
 designation= sc3.next();


   
case 2: System.out.println("viewing data");
System.out.println("EmployeeID:"+ID);
System.out.println("Name:"+name);
System.out.println("designation is:"+designation);
break;

   

default:System.out.println("Invalid user");
   break;

}
}
}
