//Extend the above problem, read the odd and even files in a sequence and write into one single file.
package JavaIO;
import java.io.SequenceInputStream;
import java.io.FileWriter;
import java.io.FileInputStream;

public class Q23 {
	public static void main(String[] args) throws Exception {
		FileInputStream even = new FileInputStream("G:\\ESD\\Assignment\\Java IO\\files\\q2even.txt");
		FileInputStream odd = new FileInputStream("G:\\ESD\\Assignment\\Java IO\\files\\q2odd.txt");
		FileWriter write = new FileWriter("G:\\ESD\\Assignment\\Java IO\\files\\q3.txt");
		SequenceInputStream read = new SequenceInputStream(odd, even);
		
		for (int i; (i = read.read()) != -1; )
			write.write((char) i);
		
		read.close();
		write.close();
		even.close();
		odd.close();
	}
}