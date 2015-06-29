public class Hink {

	private int maxInnehåll, innehåll;
	private boolean går;

	public Hink(int m, int i) {
		maxInnehåll=m;
		innehåll=i;
	}
	public Hink(int m) {
		maxInnehåll=m;
	}
	public int fyll() {
		int rest=maxInnehåll-innehåll;
		innehåll=maxInnehåll;
		return rest;
	}
	public boolean fyll(int i) {
		if (maxInnehåll>=i) {
			innehåll=innehåll+i;
			går=true;
		}
		return går;
	}
	public int hallUt() {
		int ut=innehåll;
		innehåll=0;
		return ut;
	}
	public boolean hallUt(int i) {
		if (innehåll>=i) {
			innehåll=innehåll-i;
			går=true;
		}
		return går;
	}
	public void print() {
		System.out.println("Hinken innehåller "+innehåll+" liter");
	}

}//slut class
