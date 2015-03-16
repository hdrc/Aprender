package mi;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {
		String text_temp = JOptionPane
				.showInputDialog("Escribir la temperatura");
		int temp = Integer.parseInt(text_temp);

		if (temp < 15)
			JOptionPane.showMessageDialog(null, "Hace frío");
		else if (temp < 25)
			JOptionPane.showMessageDialog(null, "Fresco");
		else if (temp < 30)
			JOptionPane.showMessageDialog(null, "Normal");
		else
			JOptionPane.showMessageDialog(null, "Hace calor");

		Grado g = new Grado();

		do
			g.grad();
		while (g.pregunta.equalsIgnoreCase("si"));

	}
}
