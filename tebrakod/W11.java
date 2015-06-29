/*
 *  summera 5+6+7+8...+n och n matas in
 *   static talar om att "det gäller hela klassen" klassvariabeln är statisk
 */
import java.io.*;

    public class W11 {

	public static void main (String [] args) throws IOException {

	    BufferedReader stdin = new BufferedReader
		(new InputStreamReader(System.in));

	    int n, sum, add;

	    System.out.print("\n\tSkriv ett jevla tal då!  ");
	    n = Integer.parseInt(stdin.readLine());
	    sum = 5;
	    add = 5;
	    while (add <= n) {
		add = add + 1;
		sum = sum + add;
		System.out.print("\n" + sum);
	    } // while is the slut
	    System.out.println("Blir " + sum);
	}//main is a slut
    }//class is a bitch slut
