package escenciales;

import javax.swing.JOptionPane;

public class EstructurasCondicionales {

	public static void main(String[] args) {

		int precio = 900;
		/*
		 * Para la estructura condicional "if", se escribe if seguido por la
		 * condición a evaluar entre paréntesis, y entre llaves la acción a
		 * ejecutarse si la condición resulta verdadera.
		 */

		if (precio > 100)
			System.out.println("El precio es mayor que 100");
		else if (precio > 80)
			System.out.println("El precio es mayor que 80");
		else
			System.out.println("El precio es menor que 80");

		// If andidados, otra forma de hacer lo mismo que está más arriba
		int precio2 = 50;
		if (precio2 > 100)
			System.out.println("El precio es mayor que 100");
		else if (precio2 > 80)
			System.out.println("El precio es mayor que 80");
		else
			System.out.println("El precio es menor que 80");

		/*
		 * "Switch" es una estructura de selección múltiple que permite elegir
		 * entre varias opciones y decidir qué hacer en cada caso
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
		case "Sábado":
			System.out.println("Hoy es " + dia);
			break;
		case "Domingo":
			System.out.println("Hoy es " + dia);
			break;
		}

		// Si se quiere dar las mismas instrucciones para varios casos, se hace
		// así:
		String d = JOptionPane.showInputDialog("Introduce un día de la semana");
		switch (d.toLowerCase()) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			JOptionPane.showMessageDialog(null, "Es un día laboral");
			break;
		case "domingo":
		case "sábado":
			JOptionPane.showMessageDialog(null, "Es feriado");
			;
		default:
			JOptionPane
			.showMessageDialog(null, "Introduce un día de la semana");
		}
	}
}
