public class HeapSort {
	public static void versickern(int[] zahlen, int knoten, int anzahl) {
		int i = knoten; // Kindknoten
		int x = zahlen[i];
		boolean versickernErforderlich = true;

		while (2 * i < anzahl) {
			int j = 2 * i;
			if (j + 1 < anzahl && zahlen[j] < zahlen[j + 1]) {
				j++;
			}
			if (x < zahlen[j]) {
				zahlen[i] = zahlen[j];
				i = j;
			} else {

				zahlen[i] = x;
				i = anzahl;
				versickernErforderlich = false;

			}
		}
		if (versickernErforderlich) {
			zahlen[i] = x;
		}
	}

	public static void heapsort(int[] zahlen) {
		for (int i = (zahlen.length - 1) / 2; i >= 0; i--) {
			versickern(zahlen, i, zahlen.length - 1);
		}

		for (int i = zahlen.length - 1; i > 0; i--) {
			int x = zahlen[0];
			zahlen[0] = zahlen[i];
			zahlen[i] = x;

			versickern(zahlen, 0, i);
		}

	}

	public static void main(String[] args) {
		for (int a = 0; a < 20; a++) {
			// Anzahl für diesen Durchlauf ermitteln
			int[] zahlen = new int[(int) (Math.random() * 20 + 10)];

			// Array mit Zufallszahlen erzeugen
			for (int b = 0; b < zahlen.length; b++)
				zahlen[b] = (int) (Math.random() * 1000);

			// Sortieren
			heapsort(zahlen);

			// Sortiertes Array ausgeben und die Sortierung prüfen
			boolean sortiert = true;
			for (int b = 0; b < zahlen.length; b++) {
				System.out.print(zahlen[b] + " ");

				if (b > 0)
					sortiert &= zahlen[b] >= zahlen[b - 1];
			}

			System.out.println(sortiert ? "OK" : "FEHLER");
		}
	}
}