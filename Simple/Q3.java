//Implement a JAVA program to find the square of the number
package pack1;
import java.util.*;
public class Q3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
System.out.print("Enter an integer number: ");
num=sc.nextInt();
System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
}
}