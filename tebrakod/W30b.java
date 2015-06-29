import java.io.*;
public class W30b {
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
			System.out.println("gggggghhhhhheeeeeeeeeeeeee‰‰‰");
		}
	}
		public static int metoden(int i, int j) {
			if (j==1)
				return i;
			else 
				return i+metoden(i, j-1);
	   }
}
