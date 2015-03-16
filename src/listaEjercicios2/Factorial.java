package listaEjercicios2;

import javax.swing.JOptionPane;

public class Factorial {

	public static int calcularFactorial(int n) {
		int cont = n - 1;
		do {
			n = n * cont;
			cont--;
		} while (cont != 0);
		return n;
	}

	public static void main(String[] args) {
		String tN = JOptionPane
				.showInputDialog("Escribir un número para calcular su factorial");
		int n = Integer.parseInt(tN);
		int factorial = calcularFactorial(n);
		System.out.println("El factorial de " + n + " es: " + factorial);

	}

}
