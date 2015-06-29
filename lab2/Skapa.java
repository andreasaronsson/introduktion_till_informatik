/*
 * skapa en klass som lägger till nya värden i en rad i alla kolumner 
 * Andreas Aronsson, ik01-46, den 22 oktober 2001
 */

import java.io.*;

public class Skapa {

    public static void main (String [] args) throws IOException {

	//variabler som är synliga i hela klassen
        String foretagsNamn, svar;
        int boxNr, kundNr;
	Foretagskund foretagskund;

	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in));      //nya obj 

	String filnamn = "Foretagskund.txt";        
	PrintWriter filut = new PrintWriter(new BufferedWriter
	    (new FileWriter(filnamn, true)));

	System.out.print("Vill du mata in kunduppgifter (j/n) ? :  ");
        svar = stdin.readLine();   //var. svar för ett värde som sedan jfrs
	            //för att kunna iterera utan att starta prog. igen

        while (svar.equals("j"))  {

            System.out.print("Ange Företagets namn: ");
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
            svar = stdin.readLine();  //nytt värde på var svar som jfrs i while
        }
        filut.close();
    }//slut main
}// slut Skapa



