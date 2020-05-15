//Send a value and get the square and square root of the number from the server.
package Socket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;

public class Q27server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(1234);
		Socket ss = server.accept();
		Scanner req = new Scanner(ss.getInputStream());
		PrintStream resp = new PrintStream(ss.getOutputStream());
		float inp, outp;
		
		System.out.println("Started heated up");
		
		inp = Float.parseFloat(req.next());
		System.out.println(inp);
		outp = (float) Math.pow(inp, 2);
		resp.print("Square: " + outp + "\n" + "Sqrt: " + Math.pow(inp, 0.5));
		
		System.out.println("Done");
		
		req.close();
		server.close();
	}
}
