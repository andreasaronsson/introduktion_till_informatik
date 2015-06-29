/*
 * summera en käck talserie
 *
 */
import java.io.*;

public class W13  {

    public static void main(String [] args) throws IOException {

	BufferedReader stdin = new BufferedReader
                         (new InputStreamReader(System.in));

	int räk, sum, add;

	sum=1;
	räk=0;
	add=0;

	while (sum<=100000) {
	    räk=räk+1;
	    add=1+räk*2;
	    sum=sum+add;
	}
	System.out.println("Summa:  " + sum + "termer:  " + räk);
    }//main slut
}// slut: class
