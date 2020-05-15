/*Display a question to user allow the user to answer the question. Allow 3 chances
to user. If correct answer display "Good" else display correct answer after 3 attempts.*/
package Inter;
import java.util.Scanner;
public class Q11
{
	public static void main (String[] args)
	{
		System.out.println("Where is Golgumbaz is situated? ");
		String c="Bijapur";
		
		for (int i = 0; i < 3; i++)
        {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter u r answer   ");
        	String s = sc.nextLine();
    		System.out.println("You entered string "+s);
            if(c.equals(s)) {
            	System.out.println("Good");	
            	break;
            }
            else
            	System.out.println("Wrong");
        }
		System.out.println(" Correct Answer is Bijapur  ");
	}
}
