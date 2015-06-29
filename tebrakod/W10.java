/*
 *     Hur många kartonger och lådor blir det av ett givet antal tvålar
 *     fem tvålar i en låda, 120 lådor i en kartong
 */

import java.io.*;

public class W10 {

    public static void main (String [] args ) throws IOException {

	BufferedReader talin = new BufferedReader
	                             (new InputStreamReader(System.in)); 
	int tvålar, lådor, kartonger;

	System.out.print("\n\nAnge antal tvålar:   ");
	tvålar = Integer.parseInt(talin.readLine());
	kartonger = 0;
	lådor = 0;

	while (tvålar >= 600) {
	    tvålar = tvålar - 600;
	    kartonger = ++kartonger;
	}
	while (tvålar >= 120) {
	    tvålar = tvålar -120;
	    lådor = ++lådor;
	}
	System.out.println("\nNär allt e färdigpackat kommer vi ha " + 
            kartonger + "st kartonger och " + lådor + " st lådor. \nDet blir " +
			   tvålar + " st tvålar över");
    }//slut main
}//slut class (the class is a slut)  
