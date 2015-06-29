import java.io.*;
public class W22 {
	public static void main(String [] args){
		int terning=0;
		File allaKast=new File("terningskast.txt"); 
		String [] tobacco=new String[1];
		try {
			PrintWriter filUt=new PrintWriter(new FileWriter(allaKast));
			
			for (int i=0;i<50;i++) {
				terning=(int)(Math.random()*6+1);
				filUt.println(terning);
			}
			filUt.close();
		}
		catch (IOException e) {
			System.out.println("Fel vid läsning.");
			W22.main(tobacco);
		}
	}
}
