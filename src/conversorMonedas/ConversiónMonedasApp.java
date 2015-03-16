package conversorMonedas;

import javax.swing.JOptionPane;

public class ConversiónMonedasApp {

	public static void main(String[] args) {
		String pregunta = JOptionPane
				.showInputDialog(
						"¿Convertir de moneda extranjera a guaraní (escribir \"e\")"
								+ "\n o de guarani a moneda extrangera?(escribir\"g\")",
						"Escribir \"g\" o \"e\"");
		if (pregunta.equalsIgnoreCase("e")) {   
			ConversiónMonedasEG ceg = new ConversiónMonedasEG();
			ceg.ejecutar();
		} else if (pregunta.equalsIgnoreCase("g")) {
			ConversiónMonedasGE cge = new ConversiónMonedasGE();
			cge.ejecutar();
		} else
			JOptionPane.showMessageDialog(null, "La opcíon (" + pregunta
					+ ") no se reconoce", "Error", JOptionPane.ERROR_MESSAGE);
	}
}