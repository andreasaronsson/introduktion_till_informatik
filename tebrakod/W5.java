import java.io.*;

public class W5 {
    public static void main (String [] args) throws IOException {
	int min, a, b, c;
	BufferedReader stdin = new BufferedReader
	    (new InputStreamReader(System.in));
	System.out.print("Mata in ett heltal ");
	a = Integer.parseInt(stdin.readLine());
	System.out.print("Mata in ett heltal ");
	b = Integer.parseInt(stdin.readLine());
	System.out.print("Mata in ett heltal ");
	c = Integer.parseInt(stdin.readLine());
	min = 0;
	if (a <= b) {
	    if (c >=  a) {
		min = a;
		System.out.println("Det minsta talet �r " +  min);
	    }
	    else {
	min = c;
        System.out.println("Det minsta talet �r " + min);
	    }
	}
	else {
	    if (c >= b) {
	    min = b;
	    System.out.println("Det minsta talet �r " + min);
	    }
	    else {
		min = c;
		System.out.println("Det minsta talet �r(och nu blir det r�tt)" + min);
	    }
	}
    }
}
       
    


