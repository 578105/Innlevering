package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;


public class trinnSkatt {

	public static void main(String[] args) {

		String tallTxt = showInputDialog("Skriv inn din bruttoinntekt:");
		int bruttoinntekt = parseInt(tallTxt);
		
		String ut = "Din trinnskatt: ";
		
		
		if (bruttoinntekt < 164100)
			ut += "0 kr";
		else
			if (bruttoinntekt < 230950)
				ut += Math.round(bruttoinntekt*0.0093) + " kr";
			else
		
				if (bruttoinntekt < 580650)
					ut += Math.round(bruttoinntekt*0.0241) + " kr";
				else
					if (bruttoinntekt < 934050)
						ut += Math.round(bruttoinntekt*0.1152) + " kr";
		
					else 
						ut += Math.round(bruttoinntekt*0.1452) + " kr";
		
		
		
		showMessageDialog(null, ut);
		
		
		
		
		
	}

}
