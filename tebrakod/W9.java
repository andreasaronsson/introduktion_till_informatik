/*
 *  Ett program som beräknar ränta på ränta på fyra år...
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
	    int år; 
 
	    NumberFormat nF = NumberFormat.getInstance(Locale.UK);

	    nF.setMaximumFractionDigits(2);
	    nF.setMinimumFractionDigits(2);

	    System.out.print("\n\nAnge kapital: ");
	    kap=Double.parseDouble(talin.readLine());

	    System.out.print("\n\nAnge räntesats: ");
	    ran=Double.parseDouble(talin.readLine());

	    System.out.println("\n\nÅR\tKAPITAL");
	    år = 1;
	    while (år <= 4) {
		kap = kap + ran * kap / 100;
		System.out.println(år + "\t" + nF.format(kap));
		år = ++år;
	    }// slut while
	}// slut main
    }// slut class
