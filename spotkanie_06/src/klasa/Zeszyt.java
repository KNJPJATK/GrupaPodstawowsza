/**
 * Komentarz do całej klasy. Co robi ta klasa?
 *
 */
package klasa;

// importy bibliotek

// Zeszyt - z duzej litery i camelCase
// http://www.oracle.com/technetwork/java/codeconventions-150003.pdf
public class Zeszyt {

    // STALE
	
	// pola, właściwości, propertisy...-----------------------
	// nazwa pola: z małej litery, camelCase
	
	String format;
	int liczbaKartek;
    String papier;

	// metody -----------------------------------------------
	// nazwa metody: z małej litery, camelCase
    // Najpierw metody publiczne, potem prywatne.
    // Jeśli czujesz, że chcesz je grupować, to znak by pomyśleć, czy może by je wydzielić do osobnej klasy?

    /**
     * setFormat(String format)
     */
	public void ustawFormat(String format) {
		this.format = format;
	}

    /**
     * setPageCount(int pageCount)
     * @param liczbaKartek
     */
	public void ustawLiczbaKartek(int liczbaKartek){
		this.liczbaKartek = liczbaKartek;
	}

    /**
     * setPaper(String paper)
     * @param papier
     */
    public void ustawPapier(String papier) {
        this.papier = papier;
    }

    /**
     * show()
     */
	public void wyswietl(){
		System.out.println("format: " + format + "\nliczba kartek: " + liczbaKartek);
	}
}
