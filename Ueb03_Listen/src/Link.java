public class Link<T>
{
	private T daten;
	Link<T> naechster;

	public Link(T daten, Link<T> naechster)
	{
		this.daten = daten;
		this.naechster = naechster;
	}

	public T getDaten()
	{
		return daten;
	}

	public void setDaten(T daten)
	{
		this.daten = daten;
	}
	
	public static void main(String[] args){
		Link<String> aktuellesElement = new Link<String>("test", null);
		Link<String> neuesElement = new Link<String>("letzter", null);
		aktuellesElement.naechster=neuesElement;
		Link<String>anfang = new Link<String>("erster", aktuellesElement);
		
	}
}

