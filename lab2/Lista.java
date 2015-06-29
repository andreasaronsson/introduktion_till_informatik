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

	//..och ett käckt objekt som vi behöver för att kunna läsa från
	// bufferten och ett för att kunna skapa en fil 
        BufferedReader fin = new BufferedReader(new FileReader(filnamn));
        rad=fin.readLine(); // första raden läses;ett obj i metoden readLine
	Foretagskund kund;
        while (rad != null) {
	    kund = new Foretagskund(rad);
	    System.out.println(kund.getHela());
	    rad=fin.readLine();
        }//while slut
        fin.close();
    }//main slut
}// slut class Lista
