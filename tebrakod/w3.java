/*
 * multiplikation och division av tv� termkukar
 * m�ste vara heltal
 */

import java.io.*;

public class w3 {
    public static void main (String [] args) throws IOException {
	int a,b,p;
	float k;
	
	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in));
	     
	     System.out.print("Ge mig prod/t�ljare! ");
	     a=Integer.parseInt(stdin.readLine());
	     
	     System.out.print("...�ss� den andra bajen! f�r helvete!!! ");
	     b=Integer.parseInt(stdin.readLine());
	     while (b==0) {
		 System.out.println("JEVLA DUMH�VVE!!");
		 System.out.print("ett till f�rs�k... ");
	         b=Integer.parseInt(stdin.readLine());
	     }
	     
	     p=a*b;
	     k=a/b;
	     System.out.println("\nProdukten blir "+p+"\n\n\toch kvot= "+k);
    }
}

