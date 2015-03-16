package escenciales;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		// Declarar un array multidimensional
		int array[][] = new int[3][5];// [3filas][5columnas]
		// Asignar un valor a una posición determinada del array
		array[0][1] = 5;
		System.out.println(array[0][1]);
		System.out.println("------------------");

		// Forma para declarar un array multidimensional y llenar con datos. En
		// este ejemplo, array de 3 filas y 5 columnas
		int array2[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 } };

		// Cómo recorer un array multidimensional
		for (int[] element : array2)
			for (int j = 0; j < array2[0].length; j++)
				System.out.println(element[j]);
		System.out.println("------------------");
		// Cómo recorrer una sola fila o colunna del array
		for (int[] element : array2)
			System.out.println(element[0]);// Ejemplo recorriendo la primera
											// columna
		System.out.println("------------------");
		for (int i = 0; i < array2[0].length; i++)
			System.out.println(array2[1][i]);// Ejemplo recorriendo la segunda
		// fila
	}
}