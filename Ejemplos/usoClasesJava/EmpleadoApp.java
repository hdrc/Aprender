package usoClasesJava;

public class EmpleadoApp {

	public static void main(String[] args) {
		// Creación de un objeto a partir de la clase empleado
		// Estructura: Nombre_de_la_clase nombre_cualquiera = new
		// Nombre_de_la_clase(prarámetros del constructor, si es que tiene)
		Empleado empleado1 = new Empleado("Fernando", "Ureña", 23, 80);
		Empleado empleado2 = new Empleado("", "Lopez", 50, 1800);
		Empleado empleado3 = new Empleado("Alvaro", "Perez", 19, 800);

		// Uso de un método de la clase Empleado
		// Forma de acceder: Nombre_del_objeto.método(parámetros)
		System.out.println(empleado1.plus(30));

		// Valor del salario del empleado1
		System.out.println("El salario del empleado1 es "
				+ empleado1.getSalario());

		// Modificar la edad del empleado1
		empleado1.setEdad(43);
		empleado1.plus(100);

		// Nuevo salario del empleado
		System.out.println("El salario actual del empleado1 es "
				+ empleado1.getSalario());

		// Modificar el nombre del empleado2
		empleado2.setNombre("Antonio");
		empleado2.plus(100);

		// Salario del empleado2
		System.out.println("El salario del empleado2 es "
				+ empleado2.getSalario());

		// Uso del método toString
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
		System.out.println("-----------------------------------------------");
		// Otra forma de usar el método toString
		System.out.println(empleado1);
		System.out.println(empleado2);
		System.out.println(empleado3);

	}

}
