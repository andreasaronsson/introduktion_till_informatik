/*
 *    Uppdatera
 *    Inmatad uppgift ändras i vilkakunder.txt
 *    Andreas Aronsson, ik01-46, den 22 oktober 2001
 */
import java.io.*;
public class Uppdatera {
    public static void main(String[] args)  throws IOException  {
        Foretagskund foretagskund;
        String rad, foretagsNamn, nyf, korr; 
        int boxNr, kundNr, nyb, svar, val;
        File filIn, filUt; // Anropar klassen File, för att kunna använda 
	// delete och renamneTo
	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in)); 
	nyb=0;
	nyf=null;               //dessa variabler måste initieras
	svar=0;                 // 0 för int, null för string
	System.out.print("Vill du ändra kunduppgifter (j/n) ? ");
	korr=stdin.readLine();
	while (korr.equals("j")) {
	    //strömmarna måste öppnas i whilesatsen för att kunna ändra multi
	    filIn = new File("Foretagskund.txt"); 
	    BufferedReader fin = new BufferedReader (new FileReader(filIn));
	    filUt = new File("tempfil.txt"); //skapar nytt obj i kl. File
	    PrintWriter fut = new PrintWriter(new BufferedWriter
		(new FileWriter (filUt)));
	    System.out.print("Vilket kundnummer vill du ändra uppgifter i? ");
	    svar=Integer.parseInt(stdin.readLine());
	    System.out.print("Ange uppgift du vill ändra;" +
                             " Boxnummer(1) Företagsnamn(2): ");
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
		System.out.print("Nytt Företagsnamn: ");
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
		}//slut while (företagsnamn)
	    }// if (företagsnamn) is a slut
	    fin.close();
	    fut.close();
	    filIn.delete();       // tar bort den gamla filen
	    filUt.renameTo(filIn);// tempfilen heter numera Foretagskund.txt
	    System.out.print("Vill du ändra mer (j/n) ? ");
	    korr=stdin.readLine();
	}//slut while uppdatera (korr) 
    } // slut main
}//slut Uppdatera
