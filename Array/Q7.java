//Find the determinant of an 3x3 matrix.
package Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Q7 {
    // Function to read array elements and calculate the determinant
    public static void main(String[] args)
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int order=3;
        int[][] matrix=new int[3][3];
        System.out.println("Enter the elements of 3x3 matrix");
        int i,j;
        for(i=0;i<matrix.length;i++){
            for(j=0;j<matrix[i].length;j++){
                try{
                    matrix[i][j]=Integer.parseInt(br.readLine());
                }
                catch(Exception e){
                    System.out.println("An error occured. Please retry");
                    return;
                }
            }
        }}}
