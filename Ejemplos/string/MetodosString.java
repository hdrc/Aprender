package string;

public class MetodosString {

	public static void main(String[] args) {
		String cadena = "El que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon";

		System.out.println(cadena.charAt(1)); // Nos devolvera E

		System.out.println(cadena.charAt(11)); // Nos devolvera u

		System.out.println(cadena.endsWith("n")); // Nos devuelve true

		System.out.println(cadena.startsWith("e")); // Nos devuelve false, Java
		// distingue entre
		// mayusculas y minusculas

		System.out
		.println(cadena
				.equals("El que se fue a Sevilla perdio su silla y el que se fue al Torreon, su sillon")); // Nos
		// devuelve
		// true

		byte[] array_bytes = cadena.getBytes(); // Creamos un array de bytes e
		// insertamos la devolucion del
		// metodo

		System.out.println("Codigo ASCII de cada caracter");

		for (byte array_byte : array_bytes)
			System.out.print(array_byte + " "); // Muestra los codigos
		System.out.println("");
		System.out.println(cadena.indexOf("que")); // localiza la posicion donde
		// se encuentra alguna parte
		// del string

		System.out.println(cadena.length()); // Nos devuelve la longitud: 77

		System.out.println(cadena.replace('a', 'e').replace('i', 'e')); // Cambia
		// todas
		// las a
		// y las
		// i por
		// e

		System.out.println(cadena.toLowerCase()); // Transforma el String a
		// minusculas

		System.out.println(cadena.toUpperCase()); // Transforma el String a
		// mayusculas

	}

}
