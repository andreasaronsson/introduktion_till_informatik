import java.io.*;
import java.util.*;
/**
 *  FIFO-KÖ
 *
 */
public class W29 extends Thread {

	public static void main(String [] args){

		Vector fifo=new Vector();
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String action;
		Integer a;
		try {
			while (true) {
				action=stdin.readLine();
				if (action.equalsIgnoreCase("1")) {
					fifo.add(a=new Integer((int)(Math.random()*600)));
					System.out.println(fifo);
					System.out.println(fifo.size());
				}
				if (action.equalsIgnoreCase("2")) {
					fifo.removeElementAt(0);
					//					fifo.trimToSize();
					System.out.println(fifo);
					System.out.println(fifo.size());
				}
			}
		}
		catch (IOException e) {
			System.out.println("felskär");
		}
	}
}
