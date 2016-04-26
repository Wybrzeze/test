
public class Kobieta extends Czlowiek {
	private Uroda uroda;
	
	public Kobieta(String imie, String nazwisko, Uroda uroda) {
		
		super(imie, nazwisko);
				
		this.uroda = uroda;
	}

	public Uroda getUroda() {
		return uroda;
	}

	public void setUroda(Uroda uroda) {
		this.uroda = uroda; 
	}

	@Override
	public String toString() {
		return "Kobieta [uroda=" + uroda + ", imie=" + imie + ", nazwisko=" + nazwisko + "]";
	}
	
	
	 
}
