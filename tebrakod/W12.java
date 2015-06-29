/*
 *  W12) Ett antal sekunder skall läsas in och omvandlas till timmar minuter
 *         och sekunder
 *
 */

import java.io.*;

public class W12 {

    public static void main(String [] args) throws IOException {

	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in));

	int antTim, antMin, antSek,sek;

	System.out.print("\n\nAnge ett antal sekunder:   ");
	sek=Integer.parseInt(stdin.readLine());

	antTim=sek/3600;
	antMin=(sek/60)%60;
	antSek=sek%60;
	System.out.println("\n" + sek + " sekunder blir: ");
	System.out.println("Timmar = " + antTim + "\nMinuter = " + antMin 
			   + "\nSekunder = " + antSek);
    }//slut main
}//classlut
