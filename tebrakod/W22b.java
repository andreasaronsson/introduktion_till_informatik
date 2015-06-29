import java.io.*;
public class W22b {
	public static void main(String [] args){

		File inFil=new File("terningskast.txt");
		int[] f=new int[7];
		int hållare=0, sum=0;
		String[] tobacco=new String[1];
		try{
		BufferedReader inData=new BufferedReader(new FileReader(inFil));
		for (int i=0;i<50;i++) {
			hållare=Integer.parseInt(inData.readLine());
			sum=sum+hållare;
			f[hållare]=f[hållare]+1;
		}
		System.out.println("Antal prickar:\tAntal träffar:");
		for (int j=1;j<7;j++) {
			System.out.println(j+"\t"+f[j]);
		}
		System.out.println("Summa\t\t\t"+sum);
		}
		catch (FileNotFoundException e) {
			System.out.println("Fel vid filläsning.");
			W22b.main(tobacco);
		}
		catch (IOException e) {
			System.out.println("Fel vid skrivning/läsning.");
			W22b.main(tobacco);
		}
	}
}
