//Create a multiplication table of file as 1.txt, 2.txt....10.txt with corresponding tables till 10.
package JavaIO;
import java.io.FileWriter;

public class Q24 {
	public static void main(String[] args) throws Exception {
		String path = "G:\\ESD\\Assignment\\Java IO\\files\\";
		String fileType = ".txt";
		for (int i = 1; i <= 10; ++i) {
			String name = path + Integer.toString(i) + fileType;
			FileWriter write = new FileWriter(name);
			String table = "";
			
			for (int j = 1; j <= 10; ++j)
				table += Integer.toString(i) + " * " + Integer.toString(j) + " = " + Integer.toString(i * j) + "\n";
			write.write(table);
			
			write.close();
		}
	}
}