package Socket;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;

public class Q28Client {
	public static void main(String[] args) throws Exception {
		Socket client = new Socket("127.0.0.1", 1234);
		Scanner resp = new Scanner(client.getInputStream());
		//Scanner in = new Scanner(System.in);
		PrintStream req = new PrintStream(client.getOutputStream());
		
		req.println("5 + 2.1");
		System.out.println(resp.nextLine());
		
		resp.close();
		//in.close();
		req.close();
		client.close();
	}
}
