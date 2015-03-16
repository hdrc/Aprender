package escenciales;

import javax.swing.JOptionPane;

public class Repetición {

	public static void main(String[] args) {
		/*
		 * La estructura de repetición "while" se usa para escribir
		 * instrucciones* que se van a repetir hasta que la condición
		 * establecida sea falsa. La condición se escribe entre paréntesis
		 * después de la palabra "while" y las instrucciones a repetirse, entre
		 * llaves después de la condición
		 */

		byte num = 1;

		while (num <= 5) {
			System.out.println(num);
			num++;
		}

		/*
		 * Otra estructura de repetición es la estructura "for", con la
		 * siguiente forma: for(inicialización;condición;incremento){
		 * instrucciones } En "incicialización" se declara una variable, en
		 * "condición" se establece el valor que tiene que tener la variable
		 * para salir de la repetición y en "incremento", se determina de qué
		 * foma cambia la variable
		 */
		for (num = 1; num <= 5; num++)
			System.out.println(num);

		// Más una estructura de repetición;
		do {
			String texto = JOptionPane.showInputDialog("Numero entre 0 y 10");
			num = Byte.parseByte(texto);
		} while (num >= 10 || num < 0);
		JOptionPane.showMessageDialog(null, "El número es " + num);
	}
}
