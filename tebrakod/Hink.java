public class Hink {

	private int maxInneh�ll, inneh�ll;
	private boolean g�r;

	public Hink(int m, int i) {
		maxInneh�ll=m;
		inneh�ll=i;
	}
	public Hink(int m) {
		maxInneh�ll=m;
	}
	public int fyll() {
		int rest=maxInneh�ll-inneh�ll;
		inneh�ll=maxInneh�ll;
		return rest;
	}
	public boolean fyll(int i) {
		if (maxInneh�ll>=i) {
			inneh�ll=inneh�ll+i;
			g�r=true;
		}
		return g�r;
	}
	public int hallUt() {
		int ut=inneh�ll;
		inneh�ll=0;
		return ut;
	}
	public boolean hallUt(int i) {
		if (inneh�ll>=i) {
			inneh�ll=inneh�ll-i;
			g�r=true;
		}
		return g�r;
	}
	public void print() {
		System.out.println("Hinken inneh�ller "+inneh�ll+" liter");
	}

}//slut class
