//Generate 10 randam numbers and display them
package Inter;
import java.util.*;
class Q14 {
   public static void main(String[] args) {
      int counter;
      Random rnum = new Random();
      System.out.println("Random Numbers:");
      System.out.println("***************");
      for (counter = 1; counter <= 10; counter++) {
         System.out.println(rnum.nextInt(200));
      }
   }
}
