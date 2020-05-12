//Implement a JAVA program to find the distance of two points (x1,y1) and (x2,y2).
package pack1;
import java.lang.Math;
public class Q6 {
public static void main(String args[]){
int x1,x2,y1,y2;
double dis;
x1=1;y1=1;x2=4;y2=4;
dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("Distance between====>"+dis);
}
}