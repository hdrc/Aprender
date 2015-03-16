package escenciales;

public class MétodosJava {
	public static void main(String[] args) {

		int operador1 = 3;
		int operador2 = 5;
		// Uso de un método con retorno
		int resultado = sumaNumeros(operador1, operador2);
		// Uso de un método sin retorno
		sumaNumero(operador1, operador2);

		System.out.println("El resultado de la suma es: " + resultado);
	}

	// Método sin retorno(no devuelve ningún valor con el que se pueda hacer
	// algo después)
	public static void sumaNumero(int num1, int num2) {

		int resultado = num1 + num2;
		System.out.println("El resultado de la suma es: " + resultado);
	}

	// Método con retoro(devuelve un valor con el que se puede hacer algo
	// después)
	public static int sumaNumeros(int num1, int num2) {

		int resultado = num1 + num2;
		return resultado;
	}

}
