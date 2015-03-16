package listaEjercicios1;

import javax.swing.JOptionPane;

public class Operaciones {

	void calculadora() {
		String pregunta;
		do {
			pregunta = " ";
			String tOper1 = JOptionPane.showInputDialog("Primer operando");
			String signo = JOptionPane.showInputDialog("signo \n+-*/^%");
			String tOper2 = JOptionPane.showInputDialog("Segundo operando");

			if (tOper1.matches("\\d*") && tOper2.matches("\\d*")) {
				int oper1 = Integer.parseInt(tOper1);
				int oper2 = Integer.parseInt(tOper2);
				switch (signo) {
				case "+":
					int suma = oper1 + oper2;
					JOptionPane.showMessageDialog(null, suma);
					break;
				case "-":
					int resta = oper1 - oper2;
					JOptionPane.showMessageDialog(null, resta);
					break;
				case "*":
					int multi = oper1 * oper2;
					JOptionPane.showMessageDialog(null, multi);
					break;
				case "/":
					double div = (double) oper1 / (double) oper2;
					JOptionPane.showMessageDialog(null, div);
					break;
				case "^":
					double potencia = Math.pow(oper1, oper2);
					JOptionPane.showMessageDialog(null, potencia);
					break;
				case "%":
					double resto = oper1 % oper2;
					JOptionPane.showMessageDialog(null, resto);
					break;
				default:
					pregunta = JOptionPane
					.showInputDialog("Sólo puede ser uno de estos signos:\n+ - * / ^ %"
							+ "\n¿Intentar otra vez? (escribir si para reintentar)");
				}
			} else
				pregunta = JOptionPane
				.showInputDialog("Solo se permiten números"
						+ "\n¿Intentar otra vez? (escribir si para reintentar)");
		} while (pregunta.equalsIgnoreCase("si"));
	}

	void oper() {
		byte x = 8, y = 8;
		System.out.println("Suma: " + (x + y));
		System.out.println("Resta: " + (x - y));
		System.out.println("Multiplicación: " + x * y);
		System.out.println("División: " + x / y);
		System.out.println("Resto de la división: " + x % y);
		if (x > y)
			System.out.println("x es mayor que y");
		else if (y > x)
			System.out.println("y es mayor que x");
		else
			System.out.println("\"x\" y \"y\" son iguales");
	}
}
