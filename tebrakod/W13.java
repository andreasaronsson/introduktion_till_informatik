/*
 * summera en k�ck talserie
 *
 */
import java.io.*;

public class W13  {

    public static void main(String [] args) throws IOException {

	BufferedReader stdin = new BufferedReader
                         (new InputStreamReader(System.in));

	int r�k, sum, add;

	sum=1;
	r�k=0;
	add=0;

	while (sum<=100000) {
	    r�k=r�k+1;
	    add=1+r�k*2;
	    sum=sum+add;
	}
	System.out.println("Summa:  " + sum + "termer:  " + r�k);
    }//main slut
}// slut: class
