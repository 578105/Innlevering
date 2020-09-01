package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Fakultet {

	public static void main(String[] args) {

		int heltall = Integer.parseInt(showInputDialog("Skriv inn et positivt heltall: "));
		int resultat = 1;
		int tall = 2;
		String melding = "Svar:";
		String ut = "";

		if (heltall <= 0) {

			melding = ("Ugyldig heltall");
			ut = melding;
		} else

			while (heltall > 1) {
				resultat = resultat * tall;
				heltall--;
				tall++;
				ut = melding + resultat;
			}

		showMessageDialog(null, ut);

	}

}
