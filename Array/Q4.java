//Implement a JAVA program to find the transpose of 3x3 matrix.
package Array;
public class Q4 {  
	
	 
	 public static void main(String args[]) {
	      int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
	      int t[][] = new int[3][3];
	      // transpose the matrix
	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 3; j++) {
	            t[i][j] = a[j][i];
	         }
	      }
	      System.out.println("Original Matrix:");
	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 3; j++) {
	            System.out.print(a[i][j] + " ");
	         }
	         System.out.println();
	      }
	      System.out.println("Transposed Matrix:");
	      for (int i = 0; i < 3; i++) {
	         for (int j = 0; j < 3; j++) {
	            System.out.print(t[i][j] + " ");
	         }
	         System.out.println();
	      }
	   }	}
