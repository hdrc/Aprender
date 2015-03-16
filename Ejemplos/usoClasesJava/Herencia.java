package usoClasesJava;

public class Herencia {

	public static void main(String[] args) {
		// Crear objetos de las sub clases, al hacer eso, se puede acceder
		// atodos los métodos y atributos de las clases que éstas heredan
		Comercial comercial1 = new Comercial("Antonio", "Lopez", 24, 600, 30);
		Repartidor repartidor1 = new Repartidor("Fernando", "Ureña", 43, 400,
				"Este");

		// Invocar métodos de la clase padre
		comercial1.plus(300);
		repartidor1.plus(300);

		// Mostrar los atributos
		System.out.println("El salario actual del comercial es "
				+ comercial1.getSalario());
		System.out.println("El salario actual del repartidor es "
				+ repartidor1.getSalario());
	}
}
