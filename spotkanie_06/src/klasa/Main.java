package klasa;

public class Main {

	public static void main(String[] args) {
		Zeszyt z1 = new Zeszyt();
        Zeszyt z2 = new Zeszyt();
        Zeszyt z3 = new Zeszyt();

		z1.ustawFormat("A4");
		z1.ustawLiczbaKartek(100);
		z1.ustawPapier("w kratkę");
		z2.ustawFormat("B5");
		z2.ustawLiczbaKartek(80);
		z2.ustawPapier("w linię");
		z3.ustawFormat("A3");
		z3.ustawLiczbaKartek(32);
		z3.ustawPapier("czysty");
		
		z1.wyswietl();
		z2.wyswietl();
		z3.wyswietl();
	}

}
