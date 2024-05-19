/**
 * Miza.java
 *
 * Opis:
 * Program za prikaz delovanja GUI
 */

// Uvozimo paket za delo z V/I napravami
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Javni razred za zagon uporabniškega vmesnika
 * @author Miha Juhart
 * @version Primer 20 (GUI)
 */
 
public class Miza extends JFrame implements ActionListener {

	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField znamkaVnos;
	private JTextField alkoholVnos;
	private JTable tabela;
	private PivskaSteklenicaTableModel modelTabele;

	/** Javno statična metoda, ki se izvede ob zagonu programa
	* @param args Seznam nizov (vhodnih argumentov), ki jih vnesemo ob zagonu programa
	* @return Metoda ne vrača nič (ker je tipa void)
	*/
	public static void main(String[] args)  {
	
		// Izpišemo pozdrav v konzolo
		System.out.println("Zagnjam GUI...");
		
		Miza m = new Miza();
	
	}
	
	/** Javni konstruktor
	*/
	public Miza() {
		
		super("Miza s steklenicami");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(800, 600);
		
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj steklenico");
		znamkaVnos = new JTextField(32);
		alkoholVnos = new JTextField(8);
		modelTabele = new PivskaSteklenicaTableModel();
		tabela = new JTable(modelTabele);
		
		povrsina.add(new JLabel("Znamka:"));
		povrsina.add(znamkaVnos);
		povrsina.add(new JLabel("Stopnja alkohola:"));
		povrsina.add(alkoholVnos);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);
		
		dodajJButton.addActionListener(this);
		
		add(povrsina);
		
		setVisible(true);
	}
	
	
	/** Metoda, ki izvaja aktivnosti glede na dogodke
	* @param e Dogodek, ki je sprožil, klical metodo
	*/
	public void actionPerformed(ActionEvent e) {
	
		System.out.println("Dodajam steklenico ...");
		
		System.out.println("Znamka: " + znamkaVnos.getText());
		System.out.println("Stopnja alkohola: " + alkoholVnos.getText());
		
		modelTabele.addPivskaSteklenica(new PivskaSteklenica(znamkaVnos.getText(), 500, Double.parseDouble(alkoholVnos.getText())));
	}
	
}
