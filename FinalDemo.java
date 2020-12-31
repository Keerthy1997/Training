class A{

final int a=5;
public final void dispaly(){
System.out.println("The value is" +a);
}
}
class FinalDemo extends A{
public static void main(String args[]){
System.out.println("Hi");
A obj = new A ();


obj.display();
}
}