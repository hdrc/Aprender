package mi;

import javax.swing.JOptionPane;

public class EntradaSalida {

	public static void main(String[] args) {
		float base, altura, area;

		String text_numB = JOptionPane.showInputDialog("Base del rectángulo");
		base = Float.parseFloat(text_numB);

		String text_numA = JOptionPane.showInputDialog("Altura");
		altura = Float.parseFloat(text_numA);

		area = base * altura;

		JOptionPane
		.showMessageDialog(null, "El área del rectángulo es " + area);

	}

}
