package mi;

public class CosaString {

	public static void main(String[] args) {
		String palabra1 = "clavo";
		String palabra2 = "tornillo";
		System.out.println(palabra1.compareTo(palabra2));

		String palabra = "murcielago";
		boolean p = palabra.matches(".*[aeiou]*.");
		System.out.println(p);

	}
}
