package listaEjercicios1;

import javax.swing.JOptionPane;

public class Contrase�a {

	void secreto() {
		for (byte i = 1; i <= 3; i++) {
			String secreto = "sbbhkk";
			String contrase�a = JOptionPane
					.showInputDialog("Escribir la contrase�a" + "\n intento "
							+ i + " de 3");
			if (contrase�a.matches(secreto)) {
				JOptionPane.showMessageDialog(null, "Felicidades");
				break;
			} else
				JOptionPane.showMessageDialog(null, "Contrase�a incorrecta");
		}
	}
}
