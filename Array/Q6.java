//Implement a JAVA program to find a) mean b) average c) standard deviation d) variance
//of a given array of
package Array;
class Q6 
{ 

	static double variance(double a[], 
						double n) 
	{  
		double sum = 0; 
		
		for (int i = 0; i < n; i++) 
			sum += a[i]; 
		double mean = (double)sum / 
					(double)n; 
		double sqDiff = 0; 
		for (int i = 0; i < n; i++) 
			sqDiff += (a[i] - mean) * 
					(a[i] - mean); 
		
		return (double)sqDiff / n; 
	} 
	
	static double standardDeviation(double arr[], 
									double n) 
	{ 
		return Math.sqrt(variance(arr, n)); 
	} 
	
	// Driver Code 
	public static void main (String[] args) 
	{ 
	double average=0;
	double sum=0;
	double arr[] = {600, 470, 170, 430, 300}; 
	double n = arr.length; 
	
	System.out.println( "Variance: " + 
						variance(arr, n)); 
	System.out.println ("Standard Deviation: " + 
						standardDeviation(arr, n)); 
	for(int i = 0; i < n ; i++)
    {
        sum = sum + arr[i];
    }
    System.out.println("Sum:"+sum);
    average = sum / n;
    System.out.println("Average:"+average);
	}	
}
