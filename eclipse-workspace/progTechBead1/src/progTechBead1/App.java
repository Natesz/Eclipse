package progTechBead1;

public class App {
	public static void main(String[] args) {
		Szivacs szivacs = new Szivacs("SzivacsKolok", 10);
		Homokjaro homok = new Homokjaro("HomarTasi", 5);
		Lepegeto lepo = new Lepegeto("LepoGyerek", 8);
		
		Idojaras idojaras = new Idojaras("nnnee");
		
		szivacs.napos();
		homok.napos();
		lepo.napos();
		
		szivacs.napos();
		homok.napos();
		lepo.napos();
		
		szivacs.napos();
		homok.napos();
		lepo.napos();
		
		szivacs.napos();
		homok.napos();
		lepo.napos();
		
		szivacs.napos();
		homok.napos();
		lepo.napos();
		
		System.out.println(szivacs.isAlive());
		System.out.println(szivacs.distance);
		System.out.println(szivacs.KezdetiViz);


		System.out.println(lepo.isAlive());
		System.out.println(lepo.distance);
		System.out.println(lepo.KezdetiViz);

		System.out.println(homok.isAlive());
		System.out.println(homok.distance);
		System.out.println(homok.KezdetiViz);
		
		
	}
}
