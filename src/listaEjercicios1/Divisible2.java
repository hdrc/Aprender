package listaEjercicios1;

import javax.swing.JOptionPane;

public class Divisible2 {

	public void comprobar() {
		String text_Numero = JOptionPane
				.showInputDialog("Escribir un n�mero para comprobar si es divisible entre 2");
		int numero = Integer.parseInt(text_Numero);
		if (numero % 2 == 0)
			System.out.println("El n�mero " + numero + " es divisible entre 2");
		else
			System.out.println("El n�mero " + numero
					+ " no es divisible entre 2");
	}
}
