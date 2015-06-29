/**
 * 
 *   kollar hur mycket gold han får
 *   @author Andreas
 *   @version 1.1
 */

public class w1 {

public static void main (String [] args) {



	int räk=0;
	double ant=1;
	double sum=1;
	while (räk <= 63) {
	    räk = räk +1;
	    ant = ant * 2;
	    sum = sum + ant;
	    System.out.println(sum);
	}
    }
}


