/**
 * Steklenica.java
 *
 * Opis:
 * Delo s steklenicami
 *
 * @author Miha Juhart
 * @version Primer 16 (dedovanje)
 */

/**
 * Javni razred za prikaz dela z razredi in objekti
 */
 
public class Steklenica {
	
	// Deklariramo zasebne lastnosti steklenice
	private int kapaciteta; // v mililitrih
	private boolean jeOdprta; 
	private String vrstaVsebine;
	private int kolicinaVsebine; // v mililitrih
	
	/** Javni konstruktor za ustvarjanje novega tipa/razreda Steklenica
	* @param k Kapaciteta steklenice
	* @param v Vrsta vsebine steklenice
	* @return Nov objekt tipa steklenica
	*/
	public Steklenica(int k, String v)  {
		
		// Inicializiramo lastnosti
		kapaciteta = k;
		jeOdprta = false;
		vrstaVsebine = v;
		kolicinaVsebine = k;
		
		//Izpišemo podatke
		System.out.println("Ustvarjam objekt tipa Steklenica kapacitete " + k + " z vsebino " + v);
}

	/** Javna metoda, ki izprazni vsebino iz steklenice
	* @param k Količina, ki jo želimo izprazniti
	* @return Vrsta vsebine steklenice
	* @throws Vrže izjemo, če je steklenica zaprta
	*/
	public String izprazni(int k) throws Exception {
		
		if (jeOdprta) {
			// Zmanjšamo količino vsebine za iztočeno količino
			System.out.println("Količina pred praznjenjem " + kolicinaVsebine);
			kolicinaVsebine = kolicinaVsebine - k;
			
			System.out.println("Količina po praznjenju " + kolicinaVsebine);
			
			// Vrnemo vrsto vsebine
			return vrstaVsebine;
		}
		// Če je steklenica zaprta, vrže izjemo
		else {
			throw new Exception("Ne morem izprazniti steklenice ker je zaprta.");
		}
	}
	
	/** Javna metoda, ki odpre steklenico
	* @return Vrne true če je bilo odpiranje uspešno ali false, če je steklenica že odprta
	*/
	public boolean odpri()  {
		
		// Če je steklenica že odprta
		if (jeOdprta) {
			// Vrnemo false (ker je bila že odprta)
			return false;
		}
		// Če je steklenica zaprta
		else {
			// Spremenimo lastnost (jo odpremo)
			jeOdprta = true;
			// Vrnemo true, ker je bilo odpiranje uspešno
			return true;
		}
	}
	
	/** Javna metoda, ki vrne vsebino količine
	* @return Vrne kolicino vsebine steklenice
	*/
	public int getKolicinaVsebine()  {
	
		// Vrnemo količino vsebine
		return kolicinaVsebine;
	}
}
