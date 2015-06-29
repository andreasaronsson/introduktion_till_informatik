import java.io.*;
public class Tenta70423 {

    public static void main(String [] args) throws IOException {
	int tal, ant;
	long sum;
	ant = 0;
	sum = 0;
	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in));

	System.out.print("\n\tAnge ett positivt heltal >>>  ");
	tal = Integer.parseInt(stdin.readLine());

	while (tal > 0) {
	    ant ++;
	    tal = tal * tal;
	    sum = sum + tal;
	    System.out.print("\n\tAnge ett positivt heltal till!! >>>  ");
	    tal = Integer.parseInt(stdin.readLine());
	    System.out.println("\nKom ihåg att du avbryter med 0" +
			       "  eller ett negativt heltal!");
	}
	System.out.println("\nDu avbröt efter "+ant+" st inmatningar och "+
                           "summan blev "+sum);
    }
}
