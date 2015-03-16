package listaEjercicios3;

import javax.swing.JOptionPane;

public class Array10P {

	public static int[] completar(int array[]) {
		int cont = 1;
		int i = 0;
		do {
			String tValor = JOptionPane.showInputDialog("Valor " + cont
					+ " de 10");
			int valor = Integer.parseInt(tValor);
			array[i] = valor;
			i++;
			cont++;
		} while (i < array.length);
		return array;
	}

	public static void main(String[] args) {
		int array[] = new int[10];
		array = completar(array);
		mostrar(array);
	}

	public static void mostrar(int array[]) {
		int i = 0;
		do {
			System.out.println(array[i] + " en la posición " + i);
			i++;
		} while (i < array.length);
	}

}
