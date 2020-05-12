//Implement a JAVA program to find the distance using Pythagoras theorem.
package pack1;
import java.lang.Math;
import java.util.Scanner;
public class Q10 {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enetr A");
int a=sc.nextInt();
System.out.println("enetr B");
int b=sc.nextInt();
double d,c;
a=a*a;
b=b*b;
c=a+b;
d=Math.sqrt(c);
System.out.println("Pyrhogoras "+d);
}
}