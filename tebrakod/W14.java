import java.io.*;
public class W14 {
	public static void main (String [] args) throws ArrayIndexOutOfBoundsException, IOException  {
	    String s1, s2;
		char a;
		BufferedReader stdin = new BufferedReader
			(new InputStreamReader(System.in));
		System.out.print("Ange str�ng ett: ");
		s1=stdin.readLine();
		System.out.print("Ange str�ng tv�, och snabba p�! ");
		s2=stdin.readLine();
		int l=s1.length();
		if (s1.compareTo(s2) == 0) 
			System.out.println("De �r lika");
		
		else if (s1.compareTo(s2) != 0) 
			System.out.println("OLIKA!!!");
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.length() +  "+" +  s2.length());
		for (int i=l-1;i>=0;i--) 
			System.out.print(s1.charAt(i));
			 
		System.out.println();
		System.out.println(s2.toUpperCase());
		System.out.println(s1.substring(2)); 	 
			 
	}
}
	
