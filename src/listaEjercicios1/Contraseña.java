package listaEjercicios1;

import javax.swing.JOptionPane;

public class Contraseņa {

	void secreto() {
		for (byte i = 1; i <= 3; i++) {
			String secreto = "sbbhkk";
			String contraseņa = JOptionPane
					.showInputDialog("Escribir la contraseņa" + "\n intento "
							+ i + " de 3");
			if (contraseņa.matches(secreto)) {
				JOptionPane.showMessageDialog(null, "Felicidades");
				break;
			} else
				JOptionPane.showMessageDialog(null, "Contraseņa incorrecta");
		}
	}
}
