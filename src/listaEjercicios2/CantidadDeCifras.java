package listaEjercicios2;

import javax.swing.JOptionPane;

public class CantidadDeCifras {

	public static int contar(String text) {

		int cifras = text.length();
		return cifras;
	}

	public static void main(String[] args) {
		String text = JOptionPane
				.showInputDialog("Escribir un número entero positivo");
		if (text.matches("\\d*"))
			JOptionPane.showMessageDialog(null, "el número " + text + " tiene "
					+ contar(text) + " cifras");
		else
			JOptionPane.showMessageDialog(null,
					"Tiene que ser un número entero positivo");

	}

}
