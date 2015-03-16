package listaEjercicios1;

public class Sevilla {
	String vocales = "La lluvia en Sevilla es una maravilla";

	void contarVocales() {

		byte contador = 0;
		for (byte s = 0; s < vocales.length(); s++) {
			char letra = vocales.charAt(s);
			if ('a' == letra || 'e' == letra || 'i' == letra || 'o' == letra
					|| 'u' == letra)
				contador++;
		}
		System.out.println("Hay " + contador + " vocales");
	}

	void convertirAscii() {
		for (byte s = 0; s < vocales.length(); s++) {
			char letra = vocales.charAt(s);
			int ascii = letra;
			System.out.print(ascii);
			System.out.print(" ");
		}
	}

	void reemplazarAE() {
		String vocalees = vocales.replace('a', 'e');
		System.out.println(vocalees);
	}
}
