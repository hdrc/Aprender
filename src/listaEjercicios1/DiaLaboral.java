package listaEjercicios1;

import javax.swing.JOptionPane;

public class DiaLaboral {
	void verificar() {
		switch (JOptionPane.showInputDialog("Escribir el dia")) {
		case "lunes":
		case "martes":
		case "miercoles":
		case "jueves":
		case "viernes":
			System.out.println("Es un d�a laboral");
			break;
		default:
			System.out.println("No es un d�a laboral");
			break;
		}
	}
}
