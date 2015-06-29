import java.io.*; 
import java.util.*; 
/**
 * Listar alla uppgifter i filen som Skapa skapade
 * Andreas Aronsson, ik01-46, den 22 oktober 2001
 */
public class Lista {
    public static void main(String args[]) throws IOException { 
        
	String foretagsNamn;
        int kundNr, boxNr; 
        String rad; 
        String filnamn = "Foretagskund.txt";

	//..och ett k�ckt objekt som vi beh�ver f�r att kunna l�sa fr�n
	// bufferten och ett f�r att kunna skapa en fil 
        BufferedReader fin = new BufferedReader(new FileReader(filnamn));
        rad=fin.readLine(); // f�rsta raden l�ses;ett obj i metoden readLine
	Foretagskund kund;
        while (rad != null) {
	    kund = new Foretagskund(rad);
	    System.out.println(kund.getHela());
	    rad=fin.readLine();
        }//while slut
        fin.close();
    }//main slut
}// slut class Lista
