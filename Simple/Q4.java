//Implement a JAVA program for finding X.QUADRATIC EQ
package pack1;
import java.util.Scanner;
public class Q4 {
public static void main(String args[]){ 
Scanner input=new Scanner(System.in);
System.out.print("input a"); double a=input.nextDouble();
System.out.print("input b");
double b=input.nextDouble();
System.out.print("input c"); double c=input.nextDouble();
double result=b*b-4.0*a*c;
if(result>0.0) {
double r1=(-b+Math.pow(result, 0.5))/(2.0*a);
double r2=(-b+Math.pow(result, 0.5))/(2.0*a);
System.out.println("The roots os"+r1+"and"+r2);
}else if(result==0.0) {
double r1=-b/(2.0*a);
System.out.println("The roots os"+r1);
}
else {
System.out.println("no real roots os");
}
}
}