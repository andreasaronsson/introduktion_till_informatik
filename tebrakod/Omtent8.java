import java.io.*;

public class Omtent8 {

    public static void main(String [] args) throws IOException {

	BufferedReader stdin = new BufferedReader
	                               (new InputStreamReader(System.in));

	int poäng, sum, min, max, dårar;
	float medel;

	System.out.print("Ge mig ditt usla resultat (på tentan såklart, rajtad eller?) ");
	poäng=Integer.parseInt(stdin.readLine());

	dårar = 0;
	sum = 0;
	min = poäng;
	max = poäng;

	while (poäng > 0) {
	    sum = sum + poäng;
	    dårar ++;
	    if (poäng < min) {
		min = poäng;
	    }
	    if (poäng > max) {
		max = poäng;
	    }
	    System.out.print("Kan du bättre? ");
	    poäng=Integer.parseInt(stdin.readLine());
	    if (poäng < min) {
	    System.out.println("...eller var det sämre?");
	    } 
	}
	medel = sum / dårar;
	System.out.println("\nAntal idioter: "+ dårar+"\n Medel: "+medel);
    }
}













