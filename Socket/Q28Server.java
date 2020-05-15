//
package Socket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;

public class Q28Server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(1234);
		Socket ss = server.accept();
		Scanner req = new Scanner(ss.getInputStream());
		PrintStream resp = new PrintStream(ss.getOutputStream());
		float inp1, inp2, outp = 0;
		String op, str;
		String []expr;
		
		System.out.println("Started heated up");
		
		str = req.nextLine();
		System.out.println(str);
		expr = str.split(" ");
		inp1 = Float.valueOf(expr[0]);
		inp2 = Float.valueOf(expr[2]);
		op = expr[1];
		System.out.println("" + inp1  + op + inp2);
		switch (op) {
		case "+" : outp = inp1 + inp2; break;
		case "-" : outp = inp1 - inp2; break;
		case "*" : outp = inp1 * inp2; break;
		case "/" : outp = inp1 / inp2; break;
		}
		System.out.println("" + inp1  + op + inp2 + " = " + outp);
		resp.println("" + inp1  + op + inp2 + " = " + outp);
		System.out.println("Done");
		
		req.close();
		ss.close();
		server.close();
	}
}
