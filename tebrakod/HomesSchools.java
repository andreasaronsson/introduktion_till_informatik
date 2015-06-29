import java.text.*;
import java.util.*;
public class HomesSchools {
	public static void main(String [] args){

		double homes=100,acres=1000, kuk=0;
		double sci=1.2322, pop=20000;
		
		NumberFormat r=NumberFormat.getInstance();
		r.setMaximumFractionDigits(2);
		r.setMinimumFractionDigits(2);
		for (double schools=0;schools<100;schools+=1) {
			homes=100-schools;
			pop=pop+(homes/100)*acres*5;
			kuk=1+schools/100;
			sci=sci*kuk;
			pop=pop*sci;
			System.out.println("Schools: "+r.format(schools)+"\tHomes: "+r.format(homes)
                               +"\tPop: "+r.format(pop)+"\t"+sci+" "+kuk);
			pop=20000;
			schools=Math.round(schools);
			sci=1.2322;
		}
	}
}
