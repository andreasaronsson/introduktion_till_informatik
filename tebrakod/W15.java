import java.io.*;
public class W15 {
		private static String[] rekursiv=new String[1];

	public static String kon(String persNr) {
		String kon=null;
		if (persNr.length()!=10) {
			System.out.println("Felaktig inmatning, försök igen.");
			main(rekursiv);
		}
		boolean siffror=true;
		for (int i=0;i<10;i++) {
			if(!Character.isDigit(persNr.charAt(i))) {
				siffror=false;
				System.out.println("Inga bokstäver tack!");
				W15.main(rekursiv);
			}
		}
		if (persNr.charAt(8)%2==0) 
			kon="kvinna";
		if (persNr.charAt(8)%2==1)
			kon="man";
		return kon; 
	}
	public static void main(String[]args) {
		String persNr, kvinnaman;
		try {
			BufferedReader stdin=new BufferedReader
				(new InputStreamReader(System.in));
			System.out.print("Ge mig mummer!");
			persNr=stdin.readLine();
			while (persNr==null) {
				System.out.println("VA! SÄGER! Jag får inte! nummer!");
				System.out.println("Ge mig mummer!");
				persNr=stdin.readLine();
			}

			kvinnaman=W15.kon(persNr);
			System.out.println(kvinnaman);
		}
		catch (IOException e) {
			System.out.println("Felskär");
			W15.main(rekursiv);
		}
	}
}

