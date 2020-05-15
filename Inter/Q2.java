//Write a program that prints the sum of 3 numeric arguments taken from command line.

package Inter;
class Q2
{
public static void main(String[] args)
{
int a,b,c,d;
a=Integer.parseInt(args[0]);
System.out.println("number one is : "+a);
b=Integer.parseInt(args[1]);
System.out.println("number two is : "+b);
c=Integer.parseInt(args[1]);
System.out.println("number three is : "+c);

d=a+b+c;
System.out.println("Addition of two numbers is : "+d);
}
}
