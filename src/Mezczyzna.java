
public class Mezczyzna extends Czlowiek {

	private Wzrost wzrost;
	
	public Mezczyzna(String imie, String nazwisko, Wzrost wzrost)
	{
		super(imie, nazwisko);
		this.wzrost = wzrost;
	
		
	}

	public Wzrost getWzrost() {
		return wzrost;
	}

	public void setWzrost(Wzrost wzrost) {
		this.wzrost = wzrost;
	}

	@Override
	public String toString() {
		return "Mezczyzna [wzrost=" + wzrost + ", imie=" + imie + ", nazwisko=" + nazwisko + "]";
	}
	
	
}
