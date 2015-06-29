// läs in tal i intervallet [5,15] samt beräkna 
//och skriv ut talets summa avbryt genom att mata in tal utanför intervallet
import java.io.*;

public class W7 
{
    public static void main(String[]args) 
	{ 
		String[]rekursiv=new String[1];
		try {

			BufferedReader stdin = new BufferedReader
				(new InputStreamReader(System.in)); 
			int ta, sum=0;
			System.out.print("Mata in ett värde i intervallet [5,15] ");
			ta = Integer.parseInt(stdin.readLine());
			while (ta<=15&&ta>=5) {
				sum=sum+ta;
				System.out.print("Mata in ett värde i intervallet [5,15] ");
				ta = Integer.parseInt(stdin.readLine());
			}
			System.out.println(sum);
		}
		catch (NumberFormatException e) {
			System.out.println("FAN VA DU SUUUUUUUGER!!!!!!!");
			W7.main(rekursiv);
		}
		catch (IOException e) {
			System.out.println("FAN VA DU SUUUUUUUGER!!!!!!!");
			W7.main(rekursiv);
		}
	}
}
