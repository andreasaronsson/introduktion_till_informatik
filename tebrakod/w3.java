/*
 * multiplikation och division av två termkukar
 * måste vara heltal
 */

import java.io.*;

public class w3 {
    public static void main (String [] args) throws IOException {
	int a,b,p;
	float k;
	
	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in));
	     
	     System.out.print("Ge mig prod/täljare! ");
	     a=Integer.parseInt(stdin.readLine());
	     
	     System.out.print("...åsså den andra bajen! för helvete!!! ");
	     b=Integer.parseInt(stdin.readLine());
	     while (b==0) {
		 System.out.println("JEVLA DUMHÖVVE!!");
		 System.out.print("ett till försök... ");
	         b=Integer.parseInt(stdin.readLine());
	     }
	     
	     p=a*b;
	     k=a/b;
	     System.out.println("\nProdukten blir "+p+"\n\n\toch kvot= "+k);
    }
}

