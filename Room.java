class Room1{
float length;
float breadth;
void getdata(float a, float b)

{
length=a;breadth=b;
}
}
class Room{
public static void main(String args[]){
float area;
Room1 room1= new Room1();
room1.getdata(14,10);
area=room1.length*room1.breadth;
System.out.println("Area="+area);
}
}