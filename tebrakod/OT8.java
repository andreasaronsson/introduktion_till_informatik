/* 
 *      Uppg 8          omtentan 9 juni 01
 *
 *              Om sum multipliceras med 4 f�s ett n�rmev�rde till PI (3.14)
 */


public class OT8{

	public static void main(String args[])  {
                int ant, term, minus;
		double sum;		
		
		sum = 1.0;
		ant = 1;
		term = 1;
		minus =1;
		while (ant <= 1000)  {
                   
                    minus = - minus;
		    term = term + 2;
		    sum = sum + 1.0 * minus/term;
			// genom att mutiplicera med 1.0 undviker man
                        // heltalsdivision. Detta kr�vdes inte p� tentan.
 
		    ant = ant +1;
		    
                }
		System.out.println("Summan = " + sum);
	        
		    // En extra utskrift.Ju fler termer ju b�ttre n�rmev�rde
		System.out.println("PI = " + 4*sum);  
                      							
	}
}			
    

