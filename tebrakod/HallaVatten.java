class HallaVatten {
	public static void main(String [] args){
		Hink h1=new Hink(5, 5);
 		Hink h2=new Hink(3);


 		if (!h1.hallUt(h2.fyll()))
 			System.out.println("Kan ej hälla ut så mycket!");


		h2.hallUt();

		if (!h2.fyll(h1.hallUt()))
			System.out.println("Så mycket får inte plats i hinken.");

		h1.fyll();

		if (!h1.hallUt(h2.fyll()))
			System.out.println("Kan ej hälla ut så mycket.");

		h1.print();
		h2.print();
	}

}
