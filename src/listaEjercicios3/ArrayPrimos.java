package listaEjercicios3;

import javax.swing.JOptionPane;

public class ArrayPrimos {

	public static void crearArray(int array[], int min, int max) {
		for (int i = 0; i < array.length; i++) {
			int numero = (int) Math.ceil(Math.random() * (min - max) + max);
			boolean primo = verificarPrimos(numero);
			if (primo == true && numero > 0) {
				array[i] = numero;
				System.out.println(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		String tTamaño = JOptionPane
				.showInputDialog("Elegir el tamaño del array");
		int tamaño = Integer.parseInt(tTamaño);

		String tMin = JOptionPane.showInputDialog("Valor mínimo");
		int min = Integer.parseInt(tMin);

		String vMax = JOptionPane.showInputDialog("Valor máximo");
		int max = Integer.parseInt(vMax);

		int array[] = new int[tamaño];
		crearArray(array, min, max);
	}

	public static boolean verificarPrimos(int numero) {
		int div = 2;
		do {
			int provar = numero % div;
			if (provar == 0)
				if (numero == div)
					return true;
				else
					return false;
			div++;
		} while (div <= numero);
		return false;
	}

}
