/*Given a number,write a program using while loop reverse the digits of the number
For example, the number
12345
should be written as
54321*/
package Inter;
import java.util.Scanner;
public class Q10b {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr Number: ");
        int num=sc.nextInt();
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
