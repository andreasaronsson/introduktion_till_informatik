import java.util.*;
public class Sug {
	public static void main(String [] args){
		String [] x={"Kalle", "Pelle"};
		char [] c ={'K', 'a', 'l', 'l', 'e'};
		Vector y= new Vector();

		y.addElement("Kalle");
		y.addElement("Pelle");

		System.out.println(x);
		System.out.println(c);
		System.out.println(y);
	}
}
