//Write a program to convert the given temperature in fahrenheit to celsius using the
//following conversion formula C=(F-32)/1.8
package Inter;
import java.util.Scanner;
public class Q5 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(((fahrenheit - 32.0)) / 1.8);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
