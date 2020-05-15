//Write a program to find the number of and sum of all integers greater than 100 and less
//than 200 that are divisible by 7
package Inter;
public class Q8 {

	public static void main(String args[]) {

		int result = 0;

		for (int i = 100; i <= 200; i++) {

			if (i % 7 == 0){
				System.out.println(i);
				result += i;
              }
		}

		System.out.println("Output of Program is : " + result);
	}
}
