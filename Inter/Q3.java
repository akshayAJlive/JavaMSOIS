//Allow the user to enter a string and display the string in alphabetic order and find the
//length of string.
package Inter;
import java.util.Arrays;
import java.util.Scanner;
public class Q3 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string value: ");
      String str = sc.nextLine();
      int length=str.length();
      System.out.println(length);
      char charArray[] = str.toCharArray();
      Arrays.sort(charArray);
      System.out.println(new String(charArray));
   }
}
