/*
 *  Tent8)  23 april 01   Det största av tre inlästa tal skrivs ut
 */

import java.io.*;

class Tent8 {
    public static void main( String args[]) throws IOException {
	int tal1,tal2,tal3;
	
	BufferedReader stdin = new BufferedReader
	                        (new InputStreamReader(System.in));

	System.out.print ("Ange tal1: ");
	tal1=Integer.parseInt(stdin.readLine());
	System.out.print ("Ange tal2: ");
	tal2=Integer.parseInt(stdin.readLine());
	System.out.print ("Ange tal3: ");
	tal3=Integer.parseInt(stdin.readLine());
       
	if (tal1 > tal2)
	    if (tal1 > tal3)
		System.out.println(tal1 + " är störst");
	    else
		System.out.println(tal3 + " är störst");
	else
	    if (tal2 > tal3)
		System.out.println(tal2 + " är störst");
	    else 
		System.out.println(tal3 + " är störst");


    }
} //slut class Tent8
