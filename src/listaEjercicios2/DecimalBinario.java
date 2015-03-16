package listaEjercicios2;

import javax.swing.JOptionPane;

public class DecimalBinario {

	public static String convertirABinario(int n) {
		int r;
		String res, b = "";
		do {
			r = n % 2;
			n = n / 2;
			res = Integer.toString(r);
			b = res + b;
		} while (n != 0);
		return b;
	}

	public static void main(String[] args) {
		String tN = JOptionPane.showInputDialog("Escribir un número");
		int n = Integer.parseInt(tN);
		String b = convertirABinario(n);
		System.out.println("El número " + n + " en binario es: " + b);
	}
}
