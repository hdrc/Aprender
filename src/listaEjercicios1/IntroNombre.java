package listaEjercicios1;

import javax.swing.JOptionPane;

public class IntroNombre {

	public void escribirNombre() {
		String nombre = "Hider";
		System.out.println("Bienvenido " + nombre);

		String n = JOptionPane.showInputDialog("Escribir el nombre");
		System.out.println("Bienvenido " + n);
	}
}
