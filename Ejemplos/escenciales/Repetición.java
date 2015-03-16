package escenciales;

import javax.swing.JOptionPane;

public class Repetici�n {

	public static void main(String[] args) {
		/*
		 * La estructura de repetici�n "while" se usa para escribir
		 * instrucciones* que se van a repetir hasta que la condici�n
		 * establecida sea falsa. La condici�n se escribe entre par�ntesis
		 * despu�s de la palabra "while" y las instrucciones a repetirse, entre
		 * llaves despu�s de la condici�n
		 */

		byte num = 1;

		while (num <= 5) {
			System.out.println(num);
			num++;
		}

		/*
		 * Otra estructura de repetici�n es la estructura "for", con la
		 * siguiente forma: for(inicializaci�n;condici�n;incremento){
		 * instrucciones } En "incicializaci�n" se declara una variable, en
		 * "condici�n" se establece el valor que tiene que tener la variable
		 * para salir de la repetici�n y en "incremento", se determina de qu�
		 * foma cambia la variable
		 */
		for (num = 1; num <= 5; num++)
			System.out.println(num);

		// M�s una estructura de repetici�n;
		do {
			String texto = JOptionPane.showInputDialog("Numero entre 0 y 10");
			num = Byte.parseByte(texto);
		} while (num >= 10 || num < 0);
		JOptionPane.showMessageDialog(null, "El n�mero es " + num);
	}
}
