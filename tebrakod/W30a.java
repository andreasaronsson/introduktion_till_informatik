import java.io.*;
public class W30a {
	public static void main(String [] args) {
		int i, j;
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Ange i:");
			i=Integer.parseInt(stdin.readLine());
			System.out.print("Ange j:");
			j=Integer.parseInt(stdin.readLine());
			int summa=metoden(i, j);
			System.out.println(summa);
		}
		catch (IOException e) {
			System.out.println("gggggghhhhhheeeeeeeeeeeeeeäää");
		}
	}
		public static int metoden(int i, int j) {
			int retur=0;
			while (j>0) {
				retur=retur+i;
				j--;
			}
			return retur;
	   }
}
