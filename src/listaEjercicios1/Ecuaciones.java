package listaEjercicios1;

import javax.swing.JOptionPane;

public class Ecuaciones {

	public void segundoGrado() {
		String text_a = JOptionPane.showInputDialog("Valor de a");
		int a = Integer.parseInt(text_a);
		System.out.println("a=" + a);

		String text_b = JOptionPane.showInputDialog("Valor de b");
		int b = Integer.parseInt(text_b);
		System.out.println("b=" + b);

		String text_c = JOptionPane.showInputDialog("Valor de c");
		int c = Integer.parseInt(text_c);
		System.out.println("c=" + c);

		double discriminante = Math.pow(b, 2) - 4 * a * c;
		double x1, x2;
		System.out.println("Discriminante=" + discriminante);
		if (discriminante >= 0) {
			x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			System.out.println("x1=" + x1);
			x2 = ((-b) - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("x2=" + x2);
			JOptionPane.showMessageDialog(null, "x1=" + x1 + " \nx2=" + x2);
		} else
			System.out.println("El discriminante es negativo");
	}
}
