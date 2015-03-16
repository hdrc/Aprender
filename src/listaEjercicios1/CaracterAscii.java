package listaEjercicios1;

import javax.swing.JOptionPane;

public class CaracterAscii {

	void caracterANumero() {
		String char_ascii = JOptionPane
				.showInputDialog("introducir un caracter");
		char caracter = char_ascii.charAt(0);
		int valor = caracter;
		System.out.println(valor);
	}

	void numeroACaracter() {
		String num_ascii = JOptionPane.showInputDialog("Introducir un número");
		int num = Integer.parseInt(num_ascii);
		char numAscii = (char) num;
		System.out.println(numAscii);
	}
}
