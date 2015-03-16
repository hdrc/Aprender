package escenciales;

public class Constantes {

	public static void main(String[] args) {

		/*
		 * Para establecer un valor como constante, se escribe la palabra
		 * "final" antes del tipo de variable (byte, int, short, etc). Los
		 * valores estableci- dos como constantes no se pueden cambiar y por
		 * convención el nombre de una constante se escribe todo en mayúscula
		 */
		final double IVA = 0.10;
		int producto = 300;
		double resultado = producto * IVA;
		System.out.println("El IVA del producto es " + resultado);

	}

}
