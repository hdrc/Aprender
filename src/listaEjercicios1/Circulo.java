package listaEjercicios1;

import javax.swing.JOptionPane;

public class Circulo {

	public void area() {
		String text_R = JOptionPane.showInputDialog("Radio del círculo");
		double R = Double.parseDouble(text_R);
		double area = Math.PI * Math.pow(R, 2);
		System.out.println("El área del círculo es: " + area);
	}
}
