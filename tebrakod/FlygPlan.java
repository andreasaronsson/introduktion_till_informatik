public class FlygPlan   {


	int h�jd, flygriktning, fart;
	String modellbeteckning;

	public FlygPlan() {}

	public FlygPlan(String nyModellbeteckning) {
		modellbeteckning=nyModellbeteckning;
	}
	public FlygPlan(String nyModellbeteckning, int nyH�jd, int nyFlygriktning, 
					int nyFart) {
		modellbeteckning=nyModellbeteckning;
		h�jd=            nyH�jd;
		flygriktning=    nyFlygriktning;
		fart=            nyFart;
	}

}

