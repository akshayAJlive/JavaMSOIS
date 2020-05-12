//Implement a JAVA program to find a centroid of a triangle.
package pack1;
import java.util.Scanner;
public class Q5 {
public static void main(String args[]){
float x1=1,x2=3,x3=6;
float y1=2,y2=-4,y3=-7;
float x=(x1+x2+x3)/3;
float y=(y1+y2+y3)/3;
System.out.println("Centroid="+"("+x+","+y+")");
}
}