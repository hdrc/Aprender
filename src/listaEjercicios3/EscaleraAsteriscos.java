package listaEjercicios3;

import javax.swing.JOptionPane;

public class EscaleraAsteriscos {

	public static void main(String[] args) {
		String tAltura = JOptionPane.showInputDialog("Altura de la escalera");
		byte altura = Byte.parseByte(tAltura);
		byte escalones = 0;
		byte contador = 0;

		do {
			do {
				System.out.print("* ");
				escalones++;
			} while (escalones <= contador);
			System.out.println("");
			contador++;
			escalones = 0;
		} while (contador < altura);

	}

}
