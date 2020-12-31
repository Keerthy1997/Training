class StringDemo{

public static void main(String args[]){

String k="keerthy";
System.out.println(k);
String k1="sukumar";
k=k.concat(k1);
System.out.println(k);


System.out.println("Using new keyword");
String s= new String("my college is");
String s1=" rajagiri";
s=s.concat(s1);
System.out.println(s);


System.out.println("Using buffer keyword");
StringBuffer sb= new StringBuffer("I am from");
String sb1=" Thrissur";
sb.append(sb1);
System.out.println(sb);

System.out.println("Using string builder");
StringBuilder sbu= new StringBuilder("okay");
String sbu1=" bye";
sbu.append(sbu1);
System.out.println(sbu);





}
}