import java.io.*;

public class Omtent8 {

    public static void main(String [] args) throws IOException {

	BufferedReader stdin = new BufferedReader
	                               (new InputStreamReader(System.in));

	int po�ng, sum, min, max, d�rar;
	float medel;

	System.out.print("Ge mig ditt usla resultat (p� tentan s�klart, rajtad eller?) ");
	po�ng=Integer.parseInt(stdin.readLine());

	d�rar = 0;
	sum = 0;
	min = po�ng;
	max = po�ng;

	while (po�ng > 0) {
	    sum = sum + po�ng;
	    d�rar ++;
	    if (po�ng < min) {
		min = po�ng;
	    }
	    if (po�ng > max) {
		max = po�ng;
	    }
	    System.out.print("Kan du b�ttre? ");
	    po�ng=Integer.parseInt(stdin.readLine());
	    if (po�ng < min) {
	    System.out.println("...eller var det s�mre?");
	    } 
	}
	medel = sum / d�rar;
	System.out.println("\nAntal idioter: "+ d�rar+"\n Medel: "+medel);
    }
}













