public class BaumTraversieren
{
	private Baum einBaum;

	public BaumTraversieren(Baum einBaum)
	{
		this.einBaum = einBaum;
	}

	// Pre-Order
	public String traversierePreOrder()
	{
		return (einBaum.getWurzel() != null) ? traversierePreOrder(einBaum.getWurzel()) : "Der Baum ist leer.";
	}

	private String traversierePreOrder(Knoten einKnoten)
	{
		// Diese Methode wird im Praktikum implementiert
		// TODO
		if (einKnoten == null)
		{
			return "";
		}
		else
		{
		return ""+einKnoten.getDaten() + traversierePreOrder(einKnoten.getKnotenLinks())+ traversierePreOrder(einKnoten.getKnotenRechts());	
		}
		}


	// In-Order
	public String traversiereInOrder()
	{
		return (einBaum.getWurzel() != null) ? traversiereInOrder(einBaum.getWurzel()) : "Der Baum ist leer.";
	}

	private String traversiereInOrder(Knoten einKnoten)
	{
		// Diese Methode wird im Praktikum implementiert
		// TODO
		if (einKnoten == null)
		{
			return "";
		}
		else
		{
		return traversiereInOrder(einKnoten.getKnotenLinks())+""+einKnoten.getDaten() +  traversiereInOrder(einKnoten.getKnotenRechts());
		// Umgekehrte Ausgabe
		//return traversiereInOrder(einKnoten.getKnotenRechts())+""+einKnoten.getDaten() +  traversiereInOrder(einKnoten.getKnotenLinks());
		}

	}


	// Post-Order
	public String traversierePostOrder()
	{
		return (einBaum.getWurzel() != null) ? traversierePostOrder(einBaum.getWurzel()) : "Der Baum ist leer.";
	}

	private String traversierePostOrder(Knoten einKnoten)
	{
		// Diese Methode wird im Praktikum implementiert
		// TODO

		if (einKnoten == null)
		{
			return "";
		}
		else
		{
		return traversierePostOrder(einKnoten.getKnotenLinks()) +  traversierePostOrder(einKnoten.getKnotenRechts())+""+einKnoten.getDaten();	
		}

	}
}