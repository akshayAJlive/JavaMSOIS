//Implement a JAVA program to find a factorial of a number.
package pack1;
public class Q8 {
public static void main(String args[]){
int num=12;
long factorial=multiplyno(num);
System.out.println("Factorail of"+num+"="+factorial);
}
public static long multiplyno(int num)
{
if(num>=1)
return num*multiplyno(num-1);
else
return 1;
}
}