/*
 *    Uppdatera
 *    Inmatad uppgift �ndras i vilkakunder.txt
 *    Andreas Aronsson, ik01-46, den 22 oktober 2001
 */
import java.io.*;
public class Uppdatera {
    public static void main(String[] args)  throws IOException  {
        Foretagskund foretagskund;
        String rad, foretagsNamn, nyf, korr; 
        int boxNr, kundNr, nyb, svar, val;
        File filIn, filUt; // Anropar klassen File, f�r att kunna anv�nda 
	// delete och renamneTo
	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in)); 
	nyb=0;
	nyf=null;               //dessa variabler m�ste initieras
	svar=0;                 // 0 f�r int, null f�r string
	System.out.print("Vill du �ndra kunduppgifter (j/n) ? ");
	korr=stdin.readLine();
	while (korr.equals("j")) {
	    //str�mmarna m�ste �ppnas i whilesatsen f�r att kunna �ndra multi
	    filIn = new File("Foretagskund.txt"); 
	    BufferedReader fin = new BufferedReader (new FileReader(filIn));
	    filUt = new File("tempfil.txt"); //skapar nytt obj i kl. File
	    PrintWriter fut = new PrintWriter(new BufferedWriter
		(new FileWriter (filUt)));
	    System.out.print("Vilket kundnummer vill du �ndra uppgifter i? ");
	    svar=Integer.parseInt(stdin.readLine());
	    System.out.print("Ange uppgift du vill �ndra;" +
                             " Boxnummer(1) F�retagsnamn(2): ");
	    val=Integer.parseInt(stdin.readLine()); 
	    if (val==1) {
		System.out.print("Nytt boxnummer: ");
		nyb=Integer.parseInt(stdin.readLine());
		rad=fin.readLine();
		while (rad != null) {
		    foretagskund = new Foretagskund(rad);
		    if (foretagskund.getKundNr() != svar) { 
			fut.println(foretagskund.getHela());
		    }
		    else {
			foretagskund.setBoxNr(nyb);
			fut.println(foretagskund.getHela());
		    }
		    rad=fin.readLine();
		} //slut while
	    } // slut if (boxnummer)
	    if (val==2) {
		System.out.print("Nytt F�retagsnamn: ");
		nyf=stdin.readLine();
		rad=fin.readLine();
		while (rad != null) {
		    foretagskund = new Foretagskund(rad);
		    if (foretagskund.getKundNr() != svar) {
			fut.println(foretagskund.getHela());
		    }
		    else {
			foretagskund.setForetagsNamn(nyf);
			fut.println(foretagskund.getHela());
		    }
		    rad=fin.readLine();
		}//slut while (f�retagsnamn)
	    }// if (f�retagsnamn) is a slut
	    fin.close();
	    fut.close();
	    filIn.delete();       // tar bort den gamla filen
	    filUt.renameTo(filIn);// tempfilen heter numera Foretagskund.txt
	    System.out.print("Vill du �ndra mer (j/n) ? ");
	    korr=stdin.readLine();
	}//slut while uppdatera (korr) 
    } // slut main
}//slut Uppdatera
