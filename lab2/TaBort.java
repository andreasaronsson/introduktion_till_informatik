/*
 *    TaBort
 *    Inmatad uppgift raderas fr�n Foretagskund.txt
 *    Andreas Aronsson, ik01-46, den 22 oktober 2001
 */
import java.io.*;
public class TaBort {
    public static void main(String[] args)  throws IOException  {
        Foretagskund foretagskund;
        String rad, foretagsNamn, val; 
        int boxNr, kundNr, svar;
       
        File filIn, filUt; // Referensvariabler f�r att komma �t met. 
	                     // i class File 

	BufferedReader stdin = new BufferedReader
                            (new InputStreamReader(System.in)); 

	System.out.print("Vill du ta bort kunder fr�n databasen (j/n) ? ");
	val=stdin.readLine();
	while (val.equals("j")) {
	    filIn = new File("Foretagskund.txt");
	    BufferedReader fin = new BufferedReader (new FileReader(filIn));
	    filUt = new File("tempfil.txt");
	    PrintWriter fut = new PrintWriter(new BufferedWriter
    			                	(new FileWriter (filUt)));
	    System.out.print("Ange kundnummer du vill ta bort: ");
	    svar=Integer.parseInt(stdin.readLine()); 
	    rad=fin.readLine();
	    while (rad != null) {
		foretagskund = new Foretagskund(rad);
		if (foretagskund.getKundNr() != svar) 
		    fut.println(foretagskund.getHela());
		rad=fin.readLine();
	    } //slut while �ndra med kundnummer
        fin.close();
        fut.close();
        filIn.delete();         // tar bort den gamla filen
        filUt.renameTo(filIn);  // tempfilen heter numera Foretagskund.txt
      	System.out.print("Ska vi ta bort �nnu fler (j/n) ? ");
	val=stdin.readLine();
	} //slut while val
    } // slut main
}//slut TaBort
