/**
 *
 * division med rest, dvs % samt hur m�nga ggr div e m�jlig
 * @author Andreas
 */
import java.io.*;
public class w2 {
    
    public static void main (String args []) throws IOException {
	
	int q = 0;
	int m, n;
	
	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in));
	System.out.print("Ange talet du vill dela upp: ");
	m=Integer.parseInt(stdin.readLine());
	System.out.print("Och i hur m�nga delar? ");
	n=Integer.parseInt(stdin.readLine());
	if (n <= 0) {
	    System.out.println("Satana, fyfan tjocka gubben");
	    System.out.print("Och i hur m�nga delar? ");
	    n=Integer.parseInt(stdin.readLine());
	}

	
	while (m>=n && n !=0) {
	    m=m-n;
	    q=q+1;
	}
	System.out.println("\nS�� gubben...rest e = "+
           m+" lugna.. "+q+"=divve va");

    }
}
