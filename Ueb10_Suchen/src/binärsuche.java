
public class bin�rsuche{
	public static String[] feld;

	public bin�rsuche() {
		this.feld = new String[9];
		this.feld[0] = "ABC";
		this.feld[1] = "AEF";
		this.feld[2] = "BEX";
		this.feld[3] = "DEH";
		this.feld[4] = "DZU";
		this.feld[5] = "EVG";
		this.feld[6] = "FUC";
		this.feld[7] = "SJD";
		this.feld[8] = "ZMB";
	}

	public static boolean bin�rSuche(String[] worte, String begriff) {
		int links = 0;
		int rechts = worte.length-1;
		int m;
		
		if (links > rechts) {
			return false;
		} else {
			m = (rechts + links) / 2;
		}

		while (links <= rechts)
		{
	
			if (worte[m].compareTo(begriff) == 0) {
				return true;
			} else if (worte[m].compareTo(begriff) < 0) {
				links = m+1;
			} else if (worte[m].compareTo(begriff) > 0) {
				rechts = m-1;
			}
			m = (rechts + links) / 2;
		}
	return false;

	}

	public static void main(String[] args) {
		bin�rsuche suche1 = new bin�rsuche();
		System.out.println(suche1.bin�rSuche(feld, "BEX"));
		System.out.println(suche1.bin�rSuche(feld, "BEv"));
	}
}
