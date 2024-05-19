/**
 * HelloWorld.java
 *
 * Opis:
 * Program, ki v ukazno konzolo izpiše "Pozdravljen,Svet!"
 * V nadeljevanju služi prikazu delovanja razredov in objektov
 *
 * @author Miha Juhart
 * @version Primer 19a (vmesnik)
 */

// Uvozimo paket za delo z V/I napravami
import java.io.*;
import java.util.*;

/**
 * Javni razred za prikaz delovanja jave
 */
 
public class HelloWorld {

	// Deklariramo lastnost za vnos iz konzole
	private static BufferedReader in;
	private static ArrayList<PivskaSteklenica> pivskeSteklenice;

	/** Javno statična metoda, ki se izvede ob zagonu programa
	* @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
	* @return Metoda ne vrača nič (ker je tipa void)
	*/
	public static void main(String[] args)  {
	
		in = new BufferedReader(new InputStreamReader(System.in));
		
		pivskeSteklenice = new ArrayList<PivskaSteklenica>();
	
		// Izpišemo pozdrav v konzolo
		System.out.println("Pozdravljen Svet!");
		
		//Ustvarimo objekt tipa Steklenica
		Steklenica zganje = new Steklenica(50,"Žganje");
		Steklenica voda = new Steklenica(500,"Voda");
		
		// Deklariramo spremenljivko za kolicino vode
		int kv = 0;
		// Poskusimo prebrati niz
		try {
			System.out.println("Koliko vode naj izpraznim iz kozarca?");
			String kolicinaVode = in.readLine();
			System.out.println("Iz kozarca bom izpraznil " + kolicinaVode + " ml vode.");
			
			kv = Integer.parseInt(kolicinaVode);
		}
		catch (Exception e) {
			System.out.println("Prišlo je do napake pri vnosu: " + e);
		}
		
		// Iz steklenice za vodo izpraznimo toliko vode kolikor smo vnesli v konzolo
		try {
			voda.odpri();
			String vsebinaKozarca = voda.izprazni(kv);
			System.out.println("Vsebina kozarca je " + vsebinaKozarca);
		} catch (Exception e) {
			System.out.println("Prišlo je do napake pri praznjenju steklenice: " + e);
		}
		
		// Odpremo steklenico z žganjem
		zganje.odpri();
		try {
			String pozirek = zganje.izprazni(20);
			System.out.println("Naredili smo požirek " + pozirek);
		} catch (Exception e) {
			System.out.println("Prišlo je do napake pri praznjenju steklenice: " + e);
		}
		
		// Ustvarimo tri pivske steklenice
		PivskaSteklenica velikoLasko = new PivskaSteklenica("Laško", 500);
		PivskaSteklenica maliUnion = new PivskaSteklenica("Union", 330);
		PivskaSteklenica heiniken = new PivskaSteklenica("Heiniken", 330);
		
		// Steklenice dodamo v seznam
		pivskeSteklenice.add(velikoLasko);
		pivskeSteklenice.add(maliUnion);
		pivskeSteklenice.add(heiniken);
		
		// Dodamo brezalkoholno pivo
		pivskeSteklenice.add(new PivskaSteklenica("Laško Malt", 500, 0.0));
		
		// Odpremo vse steklenice v seznamu
		for (int c=0; c< pivskeSteklenice.size(); c++) {
			if(pivskeSteklenice.get(c).odpri()) {
				System.out.println("Pivska steklenica številka " + c + " uspešno odprta.");
			}
		}
		
		// Kličemo metode, ki so bile deklarirane že v nadrazredu
		//velikoLasko.odpri();
		try {
			System.out.println("Naredili smo požirek " + velikoLasko.izprazni(50));
		} catch (Exception e) {
			System.out.println("Prišlo je do napake pri praznjenju steklenice: " + e);
		}
		
		// Branje iz konzole in ustvarjanje novega objekta
		try {
			System.out.println("Steklenico kakšne kapacitete naj ustvarim?");
			String kapaciteta = in.readLine();			
			int k = Integer.parseInt(kapaciteta);
			System.out.println("Kakšna pa je njena vsebina?");
			String v = in.readLine();		
			Steklenica steklenica = new Steklenica(k, v);
		}
		catch (Exception e) {
			System.out.println("Prišlo je do napake pri vnosu: " + e);
		}
	}
}
