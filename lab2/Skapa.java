/*
 * skapa en klass som l�gger till nya v�rden i en rad i alla kolumner 
 * Andreas Aronsson, ik01-46, den 22 oktober 2001
 */

import java.io.*;

public class Skapa {

    public static void main (String [] args) throws IOException {

	//variabler som �r synliga i hela klassen
        String foretagsNamn, svar;
        int boxNr, kundNr;
	Foretagskund foretagskund;

	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in));      //nya obj 

	String filnamn = "Foretagskund.txt";        
	PrintWriter filut = new PrintWriter(new BufferedWriter
	    (new FileWriter(filnamn, true)));

	System.out.print("Vill du mata in kunduppgifter (j/n) ? :  ");
        svar = stdin.readLine();   //var. svar f�r ett v�rde som sedan jfrs
	            //f�r att kunna iterera utan att starta prog. igen

        while (svar.equals("j"))  {

            System.out.print("Ange F�retagets namn: ");
            foretagsNamn = stdin.readLine();
            System.out.print("Ange boxnummer: ");
            boxNr = Integer.parseInt(stdin.readLine()); 
            System.out.print("Ange kundnummer: ");
            kundNr = Integer.parseInt(stdin.readLine());  

            foretagskund = new Foretagskund(kundNr,foretagsNamn,boxNr);  
                              //objekt skapas ovan

            filut.println(foretagskund.getKundNr() + " " + 
                    foretagskund.getForetagsNamn()  + " " 
                          + foretagskund.getBoxNr());
            System.out.print("Vill du mata in fler kunduppgifter (j/n) ? :  ");
            svar = stdin.readLine();  //nytt v�rde p� var svar som jfrs i while
        }
        filut.close();
    }//slut main
}// slut Skapa



