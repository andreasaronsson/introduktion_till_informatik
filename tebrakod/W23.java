import java.io.*;
public class W23 extends Thread {
		private static String[] rekursiv=new String[1];

	public static String konvertera(int decTal, int bas) {
		int rest;		
		String octellerbin="";
		while (decTal>0) {
			rest=decTal%bas;
			octellerbin = rest + octellerbin;      
            decTal = decTal / bas;
		}
		return octellerbin;
	}
	public static void main(String[]args) {
		String octellerbin;
		int decTal, bas;

		try {
			sleep(4000);
			BufferedReader stdin=new BufferedReader
				(new InputStreamReader(System.in));
			System.out.print("Ge mig mummer!");
			decTal=Integer.parseInt(stdin.readLine());
			while (stdin==null) {
				System.out.println("VA! SÄGER! Jag får inte! nummer!");
				System.out.println("Ge mig mummer!");
				decTal=Integer.parseInt(stdin.readLine());
			}
			System.out.print("Ge mig bas!");
			bas=Integer.parseInt(stdin.readLine());
			octellerbin=konvertera(decTal, bas);
			System.out.println(octellerbin);
		}
		catch (InterruptedException e) {
			System.out.println("Felskär");
			main(rekursiv);
		}

		catch (IOException e) {
			System.out.println("Felskär");
			main(rekursiv);
		}
	}
}

