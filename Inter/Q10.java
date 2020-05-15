/*Write a program to print this triangle
b. Modify the program to produce the following form of Floyd's triangle
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1*/
package Inter;
import java.util.Scanner;
class Q10{
public static void main(String args[]){
int i,j,rows;
int count=1;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number of rows: ");

rows=scan.nextInt();

for(i=1; i<=rows; i++){
  for(j=1; j<=i; j++){
  if((i+j)%2==1){
      System.out.print("0");
  }
  else{
      System.out.print("1");
  }
  

}
System.out.println();

}
}
}
