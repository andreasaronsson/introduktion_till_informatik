/*
 *     Hur m�nga kartonger och l�dor blir det av ett givet antal tv�lar
 *     fem tv�lar i en l�da, 120 l�dor i en kartong
 */

import java.io.*;

public class W10 {

    public static void main (String [] args ) throws IOException {

	BufferedReader talin = new BufferedReader
	                             (new InputStreamReader(System.in)); 
	int tv�lar, l�dor, kartonger;

	System.out.print("\n\nAnge antal tv�lar:   ");
	tv�lar = Integer.parseInt(talin.readLine());
	kartonger = 0;
	l�dor = 0;

	while (tv�lar >= 600) {
	    tv�lar = tv�lar - 600;
	    kartonger = ++kartonger;
	}
	while (tv�lar >= 120) {
	    tv�lar = tv�lar -120;
	    l�dor = ++l�dor;
	}
	System.out.println("\nN�r allt e f�rdigpackat kommer vi ha " + 
            kartonger + "st kartonger och " + l�dor + " st l�dor. \nDet blir " +
			   tv�lar + " st tv�lar �ver");
    }//slut main
}//slut class (the class is a slut)  
