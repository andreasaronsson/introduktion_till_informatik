import java.io.*;
public class W22b {
	public static void main(String [] args){

		File inFil=new File("terningskast.txt");
		int[] f=new int[7];
		int h�llare=0, sum=0;
		String[] tobacco=new String[1];
		try{
		BufferedReader inData=new BufferedReader(new FileReader(inFil));
		for (int i=0;i<50;i++) {
			h�llare=Integer.parseInt(inData.readLine());
			sum=sum+h�llare;
			f[h�llare]=f[h�llare]+1;
		}
		System.out.println("Antal prickar:\tAntal tr�ffar:");
		for (int j=1;j<7;j++) {
			System.out.println(j+"\t"+f[j]);
		}
		System.out.println("Summa\t\t\t"+sum);
		}
		catch (FileNotFoundException e) {
			System.out.println("Fel vid fill�sning.");
			W22b.main(tobacco);
		}
		catch (IOException e) {
			System.out.println("Fel vid skrivning/l�sning.");
			W22b.main(tobacco);
		}
	}
}
