import java.util.*;
public class W28 {
	public static void main(String [] args){
		Integer m�ngd, temp, temp2;
		int  pos, koll=0, a=0, b=0, c=0, d=0, e=0;
		Vector talh�llare=new Vector();
		String f�rsta="", andra="", tredje="", fj�rde="", femte="";
		m�ngd=new Integer((int)(Math.random()*350));
		System.out.println("M�NGDEN======>>>>>   "+m�ngd);
		for (int i=0;i<m�ngd.intValue();i++) 
			talh�llare.add(new Integer((int)(Math.random()*50+1)));
		
		for (int j=0;j<talh�llare.size();j++) 
			System.out.println(talh�llare.elementAt(j));
		koll=talh�llare.size();
		int[] talarr=new int[koll];
		for (int k=0;k<koll;k++) 
			talarr[k]=((Integer)talh�llare.elementAt(k)).intValue();
		Arrays.sort(talarr);

		for (int j=0;j<koll;j++) 
			System.out.println(talarr[j]);
		System.out.println("Minsta: "+talarr[0]);
		System.out.println("St�rsta: "+talarr[koll-1]);

		for (int j=0;j<koll;j++) {
			if (talarr[j]<11)
				a=a+1;
			if (talarr[j]<21&&talarr[j]>10)
				b=b+1;
			if (talarr[j]<41&&talarr[j]>30)
				c=c+1;
			if (talarr[j]<31&&talarr[j]>20)
				d=d+1;
			if (talarr[j]<51&&talarr[j]>40)
				e=e+1;
		}
		if (a>70) {
			a=a/2;
			while (a>0) {
				f�rsta=f�rsta.concat("*");
				a--;
			}
			f�rsta=f�rsta.concat(" varje stj�rna motsvarar tv� tr�ffar.");
		}
		else 
			while (a>0) {
				f�rsta=f�rsta.concat("*");
				a--;
			}
		if (b>70) {
			b=b/2;
			while (b>0) {
				andra=andra.concat("*");
				b--;
			}
			andra=andra.concat(" varje stj�rna motsvarar tv� tr�ffar.");
		}
		else 
			while (b>0) {
				andra=andra.concat("*");
				b--;
			}
		if (c>70) {
			c=c/2;
			while (c>0) {
				tredje=tredje.concat("*");
				c--;
			}
			tredje=tredje.concat(" varje stj�rna motsvarar tv� tr�ffar.");
		}
		else 
			while (c>0) {
				tredje=tredje.concat("*");
				c--;
			}
		if (d>70) {
			d=d/2;
				while (d>0) {
					fj�rde=fj�rde.concat("*");
					d--;
				}
			fj�rde=fj�rde.concat(" varje stj�rna motsvarar tv� tr�ffar.");
		}
		else 
			while (d>0) {
				fj�rde=fj�rde.concat("*");
				d--;
			}
		if (e>70) {
			e=e/2;
				while (e>0) {
					femte=femte.concat("*");
					e--;
				}
			femte=femte.concat(" varje stj�rna motsvarar tv� tr�ffar.");
		}
		else 
			while (e>0) {
				femte=femte.concat("*");
				e--;
			}
		System.out.println(" 1 - 10|"+f�rsta);
		System.out.println("11 - 20|"+andra);
		System.out.println("21 - 30|"+tredje);
		System.out.println("31 - 40|"+fj�rde);
		System.out.println("41 - 50|"+femte);
	}
}
