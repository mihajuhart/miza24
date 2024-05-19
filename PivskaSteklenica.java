/**
 * PivskaSteklenica.java
 *
 * Opis:
 * Delo s pivskimi steklenicami
 *
 * @author Miha Juhart
 * @version Primer 16 (dedovanje)
 */

/**
 * Javni razred, ki razširja razred Steklenica in implementira AlkoholnaPijaca
 */
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {

	// Vse lastnosti od nadrazreda se prenesejo
	// Deklariramo dodatne lastnosti, ki so znacilne le za pivske steklenice
	private String znamka;
	private double temperatura;
	private double stopnjaAlkohola;
	
	// Statična lastnost, ki je enaka vsem pivskim steklenicam
	private static String material = "Steklo"; // Vse pivske steklenice so steklene
	
	/** Javni konstruktor za ustvarjanje novega tipa/razreda PivskaSteklenica
	* @param z Znamka piva
	* @param k Kapaciteta v mililitrih
	* @return Nov objekt tipa pivska steklenica
	*/
	public PivskaSteklenica(String z, int k) {

		// Poklicemo drug konstruktor
		this(z, k, 4.5);
		
	}
	
		
	/** Javni konstruktor za ustvarjanje novega tipa/razreda PivskaSteklenica
	* @param z Znamka piva
	* @param k Kapaciteta v mililitrih
	* @param s Stopnja alkohola
	* @return Nov objekt tipa pivska steklenica
	*/
	public PivskaSteklenica(String z, int k, double s) {

		// Pokličemo konstruktor nadrazreda
		super(k, "Pivo");
		
		// Inicializiramo še dodatne lastosti
		znamka = z;
		temperatura = 5.0;
		
		stopnjaAlkohola = s;
		
		// Izpišemo podatke
		System.out.println("Povska steklenica je znamke " + z);
		
	}
	
	/** Javna metoda ki vrne nstopnjo alkohola
	* @return Stopnja alkohola
	*/
	public double getStopnjaAlkohola() {
		return stopnjaAlkohola;
	}
	
	/** Javna metoda ki vrne znamko piva
	* @return Stopnja alkohola
	*/
	public String getZnamka() {
		return znamka;
	}
}
