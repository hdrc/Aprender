package mi;

import javax.swing.JOptionPane;

public class Grado {
	String respuesta, pregunta;

	void grad() {
		String text_grado = JOptionPane.showInputDialog("¿Qué grado?");
		int grado = Integer.parseInt(text_grado);
		switch (grado) {
		case 1:
		case 2:
		case 3:
			respuesta = "Primer ciclo";
			JOptionPane.showMessageDialog(null, respuesta);
			break;
		case 4:
		case 5:
		case 6:
			respuesta = "Segundo Ciclo";
			JOptionPane.showMessageDialog(null, respuesta);
			break;
		case 7:
		case 8:
		case 9:
			respuesta = "Tercer ciclo";
			JOptionPane.showMessageDialog(null, respuesta);
			break;
		default:
			respuesta = "Eso no existe, sólo del 1 al 9";
			JOptionPane.showMessageDialog(null, respuesta);
			pregunta = JOptionPane.showInputDialog("¿Intentar de nuevo?");

		}
	}
}
