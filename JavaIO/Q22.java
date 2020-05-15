//Read a file and redirect the odd and even lines into even.txt and odd.txt.
package JavaIO;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Q22 {
	public static void main(String[] args) throws Exception {
		Scanner read = new Scanner(new File("G:\\ESD\\Assignment\\Java IO\\files\\q1.csv"));
		FileWriter even = new FileWriter("G:\\ESD\\Assignment\\Java IO\\files\\q2even.txt");
		FileWriter odd = new FileWriter("G:\\ESD\\Assignment\\Java IO\\files\\q2odd.txt");
		int lineCount = 1;
		String line;
		
		while (read.hasNext()) {
			line = read.nextLine() + "\n";
			if (lineCount % 2 == 0)
				even.write(line);
			else
				odd.write(line);
			++lineCount;
		}
		
		even.close();
		odd.close();
		read.close();
	}
}