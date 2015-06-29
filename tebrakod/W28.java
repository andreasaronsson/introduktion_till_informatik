import java.util.*;
public class W28 {
	public static void main(String [] args){
		Integer mängd, temp, temp2;
		int  pos, koll=0, a=0, b=0, c=0, d=0, e=0;
		Vector talhållare=new Vector();
		String första="", andra="", tredje="", fjärde="", femte="";
		mängd=new Integer((int)(Math.random()*350));
		System.out.println("MÄNGDEN======>>>>>   "+mängd);
		for (int i=0;i<mängd.intValue();i++) 
			talhållare.add(new Integer((int)(Math.random()*50+1)));
		
		for (int j=0;j<talhållare.size();j++) 
			System.out.println(talhållare.elementAt(j));
		koll=talhållare.size();
		int[] talarr=new int[koll];
		for (int k=0;k<koll;k++) 
			talarr[k]=((Integer)talhållare.elementAt(k)).intValue();
		Arrays.sort(talarr);

		for (int j=0;j<koll;j++) 
			System.out.println(talarr[j]);
		System.out.println("Minsta: "+talarr[0]);
		System.out.println("Största: "+talarr[koll-1]);

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
				första=första.concat("*");
				a--;
			}
			första=första.concat(" varje stjärna motsvarar två träffar.");
		}
		else 
			while (a>0) {
				första=första.concat("*");
				a--;
			}
		if (b>70) {
			b=b/2;
			while (b>0) {
				andra=andra.concat("*");
				b--;
			}
			andra=andra.concat(" varje stjärna motsvarar två träffar.");
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
			tredje=tredje.concat(" varje stjärna motsvarar två träffar.");
		}
		else 
			while (c>0) {
				tredje=tredje.concat("*");
				c--;
			}
		if (d>70) {
			d=d/2;
				while (d>0) {
					fjärde=fjärde.concat("*");
					d--;
				}
			fjärde=fjärde.concat(" varje stjärna motsvarar två träffar.");
		}
		else 
			while (d>0) {
				fjärde=fjärde.concat("*");
				d--;
			}
		if (e>70) {
			e=e/2;
				while (e>0) {
					femte=femte.concat("*");
					e--;
				}
			femte=femte.concat(" varje stjärna motsvarar två träffar.");
		}
		else 
			while (e>0) {
				femte=femte.concat("*");
				e--;
			}
		System.out.println(" 1 - 10|"+första);
		System.out.println("11 - 20|"+andra);
		System.out.println("21 - 30|"+tredje);
		System.out.println("31 - 40|"+fjärde);
		System.out.println("41 - 50|"+femte);
	}
}
