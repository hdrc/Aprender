package escenciales;

public class M�todosJava {
	public static void main(String[] args) {

		int operador1 = 3;
		int operador2 = 5;
		// Uso de un m�todo con retorno
		int resultado = sumaNumeros(operador1, operador2);
		// Uso de un m�todo sin retorno
		sumaNumero(operador1, operador2);

		System.out.println("El resultado de la suma es: " + resultado);
	}

	// M�todo sin retorno(no devuelve ning�n valor con el que se pueda hacer
	// algo despu�s)
	public static void sumaNumero(int num1, int num2) {

		int resultado = num1 + num2;
		System.out.println("El resultado de la suma es: " + resultado);
	}

	// M�todo con retoro(devuelve un valor con el que se puede hacer algo
	// despu�s)
	public static int sumaNumeros(int num1, int num2) {

		int resultado = num1 + num2;
		return resultado;
	}

}
