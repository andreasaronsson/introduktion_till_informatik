/**
 * 
 *   kollar hur mycket gold han f�r
 *   @author Andreas
 *   @version 1.1
 */

public class w1 {

public static void main (String [] args) {



	int r�k=0;
	double ant=1;
	double sum=1;
	while (r�k <= 63) {
	    r�k = r�k +1;
	    ant = ant * 2;
	    sum = sum + ant;
	    System.out.println(sum);
	}
    }
}


