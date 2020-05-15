//Create a CSV file with SNo, MOVIENAME, DIRECTOR with 5 records. Also read the csv file and display.
package JavaIO;
import java.util.Scanner;
import java.io.File;

public class Q1 {
	public static void main(String[] args) throws Exception{
		Scanner csv = new Scanner(new File("F:\\ESD\\Assignment\\Java IO\\files\\q1.csv"));
		String record;
		String fields[];
		
		while (csv.hasNext()) {
			record = csv.nextLine();
			fields = record.split(",");
			for (String s : fields)
				System.out.print(s + "\t\t\t");
			System.out.println("");
		}
		
		csv.close();
	}
}