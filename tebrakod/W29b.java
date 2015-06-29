import java.io.*;
import java.util.*;
/**
 * SCHTACKK ELLE!!!
 *
 */
public class W29b {
	public static void main(String [] args){
		Stack filo=new Stack();
		Integer a;
		String action;
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				action=stdin.readLine();
				if (action.equalsIgnoreCase("1")) {
					filo.push(a=new Integer((int)(Math.random()*1000)));
					System.out.println(filo);
					System.out.println(filo.size());
				}
				if (action.equalsIgnoreCase("2")) {
					filo.pop();
					//					filo.trimToSize();
					System.out.println(filo);
					System.out.println(filo.size());
				}
			}
		}
		catch (IOException e) {
			System.out.println("felskär");
		}
	}
}
