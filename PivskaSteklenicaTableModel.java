/**
 * PivskaSteklenicaTableModel.java
 *
 * Opis:
 * Razred za prikaz delovanja tabel v GUI
 *
 */
 
 import javax.swing.table.*;

/**
 * Javni razred, ki razširja razred DefaultTableModel
 * @author Miha Juhart
 * @version Primer 20 (GUI)
 */
public class PivskaSteklenicaTableModel extends DefaultTableModel {

	public PivskaSteklenicaTableModel() {
	
		super();
		
		addColumn("Znamka");
		addColumn("Stopnja alkohola");
		
		// Dodamo testno vrstico v tabelo
		Object[] vrstica = new Object[] {"Testna znamka", "5.0"};
		
		addRow(vrstica);
		
	}
	
	/** Javna metoda, ki doda steklenico v tabelo
	*/
	public void addPivskaSteklenica(PivskaSteklenica ps) {
	
		Object[] vrstica = new Object[] {ps.getZnamka(), ps.getStopnjaAlkohola()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}
}
