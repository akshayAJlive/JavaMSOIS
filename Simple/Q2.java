//Define a two variables a and b, and using assertion check whether they are same or not.

package pack1;
import java.util.Scanner;
public class Q2 {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter A");
int a=sc.nextInt();
System.out.println("Enter B");
int b=sc.nextInt();
assert a==b:"equal";
System.out.println("not equal");
}
}