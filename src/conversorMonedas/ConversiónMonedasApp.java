package conversorMonedas;

import javax.swing.JOptionPane;

public class Conversi�nMonedasApp {

	public static void main(String[] args) {
		String pregunta = JOptionPane
				.showInputDialog(
						"�Convertir de moneda extranjera a guaran� (escribir \"e\")"
								+ "\n o de guarani a moneda extrangera?(escribir\"g\")",
						"Escribir \"g\" o \"e\"");
		if (pregunta.equalsIgnoreCase("e")) {   
			Conversi�nMonedasEG ceg = new Conversi�nMonedasEG();
			ceg.ejecutar();
		} else if (pregunta.equalsIgnoreCase("g")) {
			Conversi�nMonedasGE cge = new Conversi�nMonedasGE();
			cge.ejecutar();
		} else
			JOptionPane.showMessageDialog(null, "La opc�on (" + pregunta
					+ ") no se reconoce", "Error", JOptionPane.ERROR_MESSAGE);
	}
}