/*
 *  Ett program som ber�knar r�nta p� r�nta p� fyra �r...
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;

    public class W9 {
	public static void main(String [] args) throws IOException {
	    BufferedReader talin = new BufferedReader
                                        (new InputStreamReader(System.in));
	    double kap, ran;
	    int �r; 
 
	    NumberFormat nF = NumberFormat.getInstance(Locale.UK);

	    nF.setMaximumFractionDigits(2);
	    nF.setMinimumFractionDigits(2);

	    System.out.print("\n\nAnge kapital: ");
	    kap=Double.parseDouble(talin.readLine());

	    System.out.print("\n\nAnge r�ntesats: ");
	    ran=Double.parseDouble(talin.readLine());

	    System.out.println("\n\n�R\tKAPITAL");
	    �r = 1;
	    while (�r <= 4) {
		kap = kap + ran * kap / 100;
		System.out.println(�r + "\t" + nF.format(kap));
		�r = ++�r;
	    }// slut while
	}// slut main
    }// slut class
