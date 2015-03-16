package listaEjercicios3;

import javax.swing.JOptionPane;

public class ArrayTama�oPers {

	public static void main(String[] args) {
		String tTama�o = JOptionPane
				.showInputDialog("Elegir el tama�o del array");
		int tama�o = Integer.parseInt(tTama�o);
		int array[] = new int[tama�o];
		array = rellenar(array, 0, 9);
		int sumaValores = sumaArray(array);
		mostrarArray(array, sumaValores);
	}

	public static void mostrarArray(int array[], int sumaValores) {
		for (int i = 0; i < array.length; i++)
			System.out.println("Valor " + array[i] + " en la posici�n" + i);
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
