package escenciales;

public class Arrays {

	public static void main(String[] args) {
		// Definir un array, entre[]se pone la cantidad de posiciones del array
		int num[] = new int[10];

		// Para insertar datos en una posición determidada del array se hace
		// así:
		// nombreDelArray[posición]=datoAInsertar
		num[0] = 5;
		num[1] = 9;

		System.out.println(num[0]);
		System.out.println(num[1]);

		// También se pueden insertar los datos directamente al crear el array
		int n[] = { 5, 6, 5, 2, 3 };
		System.out.println(n[1]);
		System.out.println("_____________________________________________");

		// Forma de recorrer un array, ejemplo de array de 10 posiciones
		// completadas con múltiplos de 5
		int nmr[] = new int[10];
		for (int i = 0, multiplo = 5; i < nmr.length; i++, multiplo += 5) {
			nmr[i] = multiplo;
			System.out.println(nmr[i]);
		}
	}
}
