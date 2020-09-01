package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class KarakterskalaB {

	public static void main(String[] args) {

		for (int studentnr = 1; studentnr <= 10; studentnr++) {

			int poeng = Integer.parseInt(showInputDialog("Skriv inn din poengsum: "));
			String karakter = "Din karakter er: ";

			if (poeng < 0) {

				karakter = "Ugyldig poengsum";

			} else if (poeng < 40) {

				karakter += ("F");

			} else if (poeng < 50) {

				karakter += "E";

			} else if (poeng < 60) {

				karakter += "D";

			} else if (poeng < 80) {

				karakter += "C";

			} else if (poeng < 90) {

				karakter += "B";

			} else if (poeng <= 100) {

				karakter += "A";

			} else if (poeng > 100)

				karakter = "Ugyldig poengsum";

			showMessageDialog(null, karakter);

		}

	}

}
