package mi;

import javax.swing.JOptionPane;

public class EntradaSalida {

	public static void main(String[] args) {
		float base, altura, area;

		String text_numB = JOptionPane.showInputDialog("Base del rect�ngulo");
		base = Float.parseFloat(text_numB);

		String text_numA = JOptionPane.showInputDialog("Altura");
		altura = Float.parseFloat(text_numA);

		area = base * altura;

		JOptionPane
		.showMessageDialog(null, "El �rea del rect�ngulo es " + area);

	}

}
