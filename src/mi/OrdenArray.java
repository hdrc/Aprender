package mi;

import java.util.Arrays;

public class OrdenArray {

	public static void intercambio(int lista[]) {
		for (int i = 0; i < lista.length - 1; i++)
			for (int j = i + 1; j < lista.length; j++)
				if (lista[i] > lista[j]) {
					int auxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = auxiliar;
				}
	}

	public static void intercambioPalabras(String lista[]) {
		for (int i = 0; i < lista.length - 1; i++)
			for (int j = i + 1; j < lista.length; j++)
				if (lista[i].compareToIgnoreCase(lista[j]) > 0) {
					String auxiliar = lista[i];
					lista[i] = lista[j];
					lista[j] = auxiliar;
				}
	}

	public static void main(String[] args) {

		final int TAMAÑO = 10;
		int lista[] = new int[TAMAÑO];
		rellenarArray(lista);

		String listaString[] = { "americano", "Zagal", "Pedro", "tocado", "coz" };

		System.out.println("Array de números sin ordenar:");
		mostrarArray(lista);

		// ordenar el array
		// intercambio(lista);
		Arrays.sort(lista);

		System.out.println("Array de números ordenados:");
		mostrarArray(lista);

		System.out.println("Array de String sin ordenar:");
		mostrarArray(listaString);

		// ordenar el array
		// intercambioPalabras(listaString);
		Arrays.sort(listaString);
		System.out.println("Array de String ordenado:");
		mostrarArray(listaString);
	}

	public static void mostrarArray(int lista[]) {
		for (int element : lista)
			System.out.println(element);
	}

	public static void mostrarArray(String lista[]) {
		for (String element : lista)
			System.out.println(element);
	}

	private static int numeroAleatorio() {
		return (int) Math.floor(Math.random() * 1000);
	}

	public static void rellenarArray(int lista[]) {
		for (int i = 0; i < lista.length; i++)
			lista[i] = numeroAleatorio();
	}

}
