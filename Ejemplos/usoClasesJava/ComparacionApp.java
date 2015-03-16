package usoClasesJava;

public class ComparacionApp {

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado("Fernando", "Ureña", 23, 600);
		Empleado empleado2 = new Empleado("Antonio", "Lopez", 28, 900);
		Empleado empleado3 = new Empleado("Fernando", "Ureña", 42, 100);

		// Comprobar si son iguales
		if (empleado1.equals(empleado2))
			System.out.println("Los objetos son iguales");
		else
			System.out.println("Los objetos no son iguales");

		// Asignar la dirección del empleado1 al empleado3
		empleado3 = empleado1;

		// Comprobar si son iguales
		if (empleado3.equals(empleado1))
			System.out.println("Los objetos son iguales");
		else
			System.out.println("Los objetos no son iguales");

		// Comprobar cual es mayor
		System.out.println("Resultado: " + empleado1.compareTo(empleado2));
		if (empleado1.compareTo(empleado2) == 1)
			System.out.println("El empleado1 es mayor que el empleado2");
		else
			System.out.println("El empleado2 es mayor que el empleado1");
	}
}
