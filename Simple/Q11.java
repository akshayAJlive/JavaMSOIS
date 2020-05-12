//Print a multiplication table for given n is the number and m is the number of tm
package pack1;
import java.util.Scanner;
public class Q11 {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enetr the no");
int n=sc.nextInt();
for(int i=1;i<=10;++i)
{
System.out.printf("%d* %d = %d \n",n,i,n*i);
}
}
}