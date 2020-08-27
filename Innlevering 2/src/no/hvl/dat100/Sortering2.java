package no.hvl.dat100;

//Løsning med bare if-setninger

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Sortering2 {

	public static void main(String[] args) {

		String tallTxt1 = showInputDialog("Skriv inn helltall nr1");
		int tall1 = parseInt(tallTxt1);
		String tallTxt2 = showInputDialog("Skriv inn helltall nr2");
		int tall2 = parseInt(tallTxt2);
		String tallTxt3 = showInputDialog("Skriv inn helltall nr3");
		int tall3 = parseInt(tallTxt3);
		
		String ut = "Tallene i stigende rekkefølge:";
		
		if (tall1 < tall2)
			if (tall2 < tall3)
				ut += tall1 + " " + tall2 + " " + tall3;
			if(tall3 < tall2) 
				if(tall1 < tall3)
					ut += tall1 + " " + tall3 + " " + tall2;
				if(tall3 < tall1)
					ut += tall3 + " " + tall1 + " " + tall2;
		
		
			if (tall1 < tall3)
				ut += tall2 + " " + tall1 + " " + tall3;
			if(tall3 < tall1) 
				if( tall2 < tall3)
					ut += tall2 + " " + tall3 + " " + tall1;
				if(tall3 < tall2)
					ut += tall3 + " " + tall2 + " " + tall1;		
			
			showMessageDialog(null, ut);
		
		
		}
	}	