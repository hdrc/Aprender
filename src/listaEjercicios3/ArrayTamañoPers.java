package listaEjercicios3;

import javax.swing.JOptionPane;

public class ArrayTamañoPers {

	public static void main(String[] args) {
		String tTamaño = JOptionPane
				.showInputDialog("Elegir el tamaño del array");
		int tamaño = Integer.parseInt(tTamaño);
		int array[] = new int[tamaño];
		array = rellenar(array, 0, 9);
		int sumaValores = sumaArray(array);
		mostrarArray(array, sumaValores);
	}

	public static void mostrarArray(int array[], int sumaValores) {
		for (int i = 0; i < array.length; i++)
			System.out.println("Valor " + array[i] + " en la posición" + i);
		System.out
		.println("La suma de los valores del array es:" + sumaValores);
	}

	public static int[] rellenar(int array[], int vMin, int vMax) {
		for (int i = 0; i < array.length; i++)
			array[i] = (int) Math.round(Math.random() * (vMin - vMax) + vMax);
		return array;
	}

	public static int sumaArray(int array[]) {
		int suma = 0;
		for (int element : array)
			suma = suma + element;
		return suma;
	}

}
