/*Shown below is a Floyd's triangle.
1
2 3
4 5 6
7 8 9 10
11 ... ... ... 15
.
.
79 .. .. .. .. .. .. .. .. 91*/
package Inter;
import java.util.Scanner;

class Q9
{
   public static void main(String args[])
   {
      int n, num = 1, c, d;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number of rows of floyd's triangle you want");
      n = in.nextInt();
      System.out.println("Floyd's triangle :-");
      for ( c = 1 ; c <= n ; c++ )
      {
         for ( d = 1 ; d <= c ; d++ )
           {
              System.out.print(num+" ");
              num++;
           }
          System.out.println();
      }
   }
}
