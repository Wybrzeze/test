import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;




	 
	


public class Main {

	private static void testZadanie1() {
		//test 1
				Kobieta k1 = new Kobieta("Kasia", "Abcd", Uroda.Ladna);
				
				Mezczyzna mezczyzna = new Mezczyzna("Pawel", "Nowak", Wzrost.wysoki);
				System.out.println(k1.toString());
				System.out.println(mezczyzna);  
	}
	
	private static void testZadanie2() {
		ArrayList<Czlowiek> list = new ArrayList<>();
		list.add(new Kobieta("Ala", "Kot", Uroda.Ladna));
		list.add(new Mezczyzna("Wacek", "Xyz", Wzrost.niski));
		list.add(new Kobieta("xxx", "aaaa", Uroda.Ladna));
		list.add(new Mezczyzna("ffff", "bbb", Wzrost.niski));
		
		for(Czlowiek element : list) {
			System.out.println(element.toString());
		}
	}
	

	
	private static void testZadanie3(){
			Set<Czlowiek> zbior = new HashSet<>();
	
			for(int i = 0; i < 5; i++) {
				zbior.add(new Mezczyzna("Name"+i, "Surname"+i, Wzrost.wysoki));
				zbior.add(new Kobieta("Name" + i, "Surname"+i, Uroda.Ladna));
			}

			for(Czlowiek c : zbior) {
				System.out.println(c.toString());
			}
			
	}
	
/*	private static void testZadanie4(){
		Map<czlowiek>mapa = new HashMap<> ();
		mapa.put(new Mezczyzna)
		mapa.put(new kobieta)
	}
	*/
	public static void main(String[] args) {
	//	testZadanie1();
		//testZadanie2();
		testZadanie3();
	//test zadanie4
	}

}
