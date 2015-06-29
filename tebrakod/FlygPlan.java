public class FlygPlan   {


	int höjd, flygriktning, fart;
	String modellbeteckning;

	public FlygPlan() {}

	public FlygPlan(String nyModellbeteckning) {
		modellbeteckning=nyModellbeteckning;
	}
	public FlygPlan(String nyModellbeteckning, int nyHöjd, int nyFlygriktning, 
					int nyFart) {
		modellbeteckning=nyModellbeteckning;
		höjd=            nyHöjd;
		flygriktning=    nyFlygriktning;
		fart=            nyFart;
	}

}

