//Allow the user to enter 10 numbers. Find max, min and sort the input.
package Inter;
import java.util.Scanner;
public class Q13 
{
    public static void main(String[] args) 
    {
        int n, temp,firstNumber,lastNum;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.println(a[n - 1]);
        firstNumber = a[0];
        System.out.println("Min no  "+firstNumber);
        lastNum = a[a.length-1];
        System.out.println("Max no  "+lastNum);   
    }
}
