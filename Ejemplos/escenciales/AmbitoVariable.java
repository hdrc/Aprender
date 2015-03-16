package escenciales;

public class AmbitoVariable {

	public static void main(String[] args) {

	}

	// Una variable de método se declara dentro de un método, y solo existe
	// mientras el mismo está en ejecución
	public static void metodoPrueba() {
		for (int i = 0; 1 < 10; i++)
			System.out.println("la variable de i vale " + i);
	}

	// Una variable global es la que se declara fuera de cualquier método, al
	// principio de una clase
	static int variableGlopal = 10;

}
