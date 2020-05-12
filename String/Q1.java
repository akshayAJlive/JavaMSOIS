//Java Program to Concatenate Two Strings
package String;
import java.util.Scanner; 
public class Q1
{
public static void main(String[] args)
{
String a, b, c;
Scanner s = new Scanner(System.in);
System.out.print("Enter first string:");
a = s.nextLine();
System.out.print("Enter second string:");
b = s.nextLine();
Q1 obj = new Q1();
c = obj.concat(a, b);
System.out.println("New String:"+c);
}
String concat(String x, String y)
{
String z;
z = x + " " + y;
return z;
}
}