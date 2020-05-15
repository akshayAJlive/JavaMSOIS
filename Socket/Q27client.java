package Socket;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;

public class Q27client {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("127.0.0.1", 1234);
		Scanner resp = new Scanner(client.getInputStream());
		Scanner in = new Scanner(System.in);
		PrintStream req = new PrintStream(client.getOutputStream());
		
		System.out.print("Enter number: "); req.println(in.nextFloat());
		System.out.println(resp.nextLine()); System.out.println(resp.nextLine());
		
		resp.close();
		in.close();
		req.close();
		client.close();
	}
}
