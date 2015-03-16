package escenciales;

public class AmbitoVariable {

	public static void main(String[] args) {

	}

	// Una variable de m�todo se declara dentro de un m�todo, y solo existe
	// mientras el mismo est� en ejecuci�n
	public static void metodoPrueba() {
		for (int i = 0; 1 < 10; i++)
			System.out.println("la variable de i vale " + i);
	}

	// Una variable global es la que se declara fuera de cualquier m�todo, al
	// principio de una clase
	static int variableGlopal = 10;

}
