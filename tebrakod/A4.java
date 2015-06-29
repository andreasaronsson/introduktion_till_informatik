/*
 * ta och jämför tre tal
 *
 */

import java.io.*;
import java.util.*;

public class A4 {

    public static void main (String [] args) throws IOException {
	
	int a,b,c,min;
	
	
	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in)); 

	System.out.print("Ratta in tre(a): ");System.out.flush();
	a=Integer.parseInt(stdin.readLine());
	System.out.print("nästa(b): ");System.out.flush();
	b=Integer.parseInt(stdin.readLine());
	System.out.print("sista(c): ");System.out.flush();
	c=Integer.parseInt(stdin.readLine());

	if (a<b && a<c) {
	    min=a;
	}
	if (b<c && b<a) {
	    min=b;
	}
	else {
	    min=c;
	}
	System.out.println("Minsta talet= "+min);
    }
}

