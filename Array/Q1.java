//Implement a JAVA program to find the minimum and maximum value of an array
package Array;
import java.lang.Math;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Q1 {  
	
	 
	    public static void main(String[] args)
	    {
	 
	        // Creates an array of integer numbers in it.
	        System.out.println("Enter Up To 10 Numbers");
	        Scanner sc=new Scanner(System.in);
	        Integer[] numbers =new Integer[10];
	 
	        for (int i=0;i<numbers.length;i++)
	        {
	            System.out.print("enter numbers["+i+"]:");
	            numbers[i]=sc.nextInt();
	        }
	  
	        int min = (int) Collections.min(Arrays.asList(numbers));
	        int max = (int) Collections.max(Arrays.asList(numbers));
	 
	        System.out.println("Min number: " + min);
	        System.out.println("Max number: " + max);
	    }
	}
