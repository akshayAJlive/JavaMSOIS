//Implement a JAVA program to find the Armstrong number.
package pack1;
import java.lang.Math;
public class Q9 {
public static void main(String args[]){
int num=371,roriginalno,remainder,result=0;
roriginalno=num;
while(roriginalno!=0)
{
remainder=roriginalno%10;
result+=Math.pow(remainder,3);
roriginalno/=10;
}
if(result==num)
System.out.println(num+" is an Armstrong no");
else
System.out.println(num+"not Armstrong no");
}
}