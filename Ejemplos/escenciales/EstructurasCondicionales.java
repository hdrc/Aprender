package escenciales;

import javax.swing.JOptionPane;

public class EstructurasCondicionales {

	public static void main(String[] args) {

		int precio = 900;
		/*
		 * Para la estructura condicional "if", se escribe if seguido por la
		 * condici�n a evaluar entre par�ntesis, y entre llaves la acci�n a
		 * ejecutarse si la condici�n resulta verdadera.
		 */

		if (precio > 100)
			System.out.println("El precio es mayor que 100");
		else if (precio > 80)
			System.out.println("El precio es mayor que 80");
		else
			System.out.println("El precio es menor que 80");

		// If andidados, otra forma de hacer lo mismo que est� m�s arriba
		int precio2 = 50;
		if (precio2 > 100)
			System.out.println("El precio es mayor que 100");
		else if (precio2 > 80)
			System.out.println("El precio es mayor que 80");
		else
			System.out.println("El precio es menor que 80");

		/*
		 * "Switch" es una estructura de selecci�n m�ltiple que permite elegir
		 * entre varias opciones y decidir qu� hacer en cada caso
		 */
		String dia = "Lunes";

		switch (dia) {
		case "Lunes":
			System.out.println("Hoy es " + dia);
			break;
		case "Martes":
			System.out.println("Hoy es " + dia);
			break;
		case "Miercoles":
			System.out.println("Hoy es " + dia);
			break;
		case "Jueves":
			System.out.println("Hoy es " + dia);
			break;
		case "Viernes":
			System.out.println("Hoy es " + dia);
			break;
		case "S�bado":
			System.out.println("Hoy es " + dia);
			break;
		case "Domingo":
			System.out.println("Hoy es " + dia);
			break;
		}

		// Si se quiere dar las mismas instrucciones para varios casos, se hace
		// as�:
		String d = JOptionPane.showInputDialog("Introduce un d�a de la semana");
		switch (d.toLowerCase()) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			JOptionPane.showMessageDialog(null, "Es un d�a laboral");
			break;
		case "domingo":
		case "s�bado":
			JOptionPane.showMessageDialog(null, "Es feriado");
			;
		default:
			JOptionPane
			.showMessageDialog(null, "Introduce un d�a de la semana");
		}
	}
}
