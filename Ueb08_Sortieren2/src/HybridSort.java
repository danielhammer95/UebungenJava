public class HybridSort
{
	public static void bubblesort(int[] zahlen, int links, int rechts)
	{
		int i = zahlen.length-1;
		boolean getauscht = true;
		while(i>1 & getauscht)
		{
			for(int j =0; j<i; j++)
			{
				if(zahlen[j] > zahlen[j+1])
				{
					int x=zahlen[j];
					zahlen[j]=zahlen[j+1];
					zahlen[j+1]=x;
					getauscht=true;
				}
			}
			i--;
		}
	}

	public static void quicksort(int[] zahlen, int links, int rechts)
	{
		if ((rechts-links)+1 >= 4)
		{
		int li=links;
		int re=rechts; 
		
		int pivotelement=zahlen[(links+rechts)/2];
		
		do{
		while (zahlen[li]<pivotelement)
		{
			li++;
		}
		while (zahlen[re]>pivotelement)
		{
			re--;
		}
		if(li<=re)
		{
			int x=zahlen[li];
			zahlen[li]=zahlen[re];
			zahlen[re]=x;
			li++;
			re--;
		}
		} while (!(li > re));
		if (links < re)
		{
			quicksort(zahlen, links, re);
		}
		if (rechts > li)
		{
			quicksort(zahlen, li, rechts);
		}
		}
		else
		{
			bubblesort(zahlen, rechts, links);
		}
	}

	public static void main(String[] args)
	{
		for (int a=0; a<20; a++)
		{
			// Anzahl für diesen Durchlauf ermitteln
			int[] zahlen = new int[(int)(Math.random()*20+10)];

			// Array mit Zufallszahlen erzeugen
			for (int b=0; b<zahlen.length; b++)
				zahlen[b] = (int)(Math.random()*1000);

			// Sortieren
			quicksort(zahlen, 0, zahlen.length-1);

			// Sortiertes Array ausgeben und die Sortierung prüfen
			boolean sortiert = true;
			for (int b=0; b<zahlen.length; b++)
			{
				System.out.print(zahlen[b] + " ");

				if (b>0)
					sortiert &= zahlen[b] >= zahlen[b-1];
			}

			System.out.println(sortiert ? "OK" : "FEHLER");
		}
	}
}