package listaEjercicios1;

import javax.swing.JOptionPane;

public class Contraseña {

	void secreto() {
		for (byte i = 1; i <= 3; i++) {
			String secreto = "sbbhkk";
			String contraseña = JOptionPane
					.showInputDialog("Escribir la contraseña" + "\n intento "
							+ i + " de 3");
			if (contraseña.matches(secreto)) {
				JOptionPane.showMessageDialog(null, "Felicidades");
				break;
			} else
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
		}
	}
}
