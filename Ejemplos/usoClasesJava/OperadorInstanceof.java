package usoClasesJava;

public class OperadorInstanceof {

	// El operador instanceof permite comprobar si un objeto es o no de tal
	// clase
	public static void main(String[] args) {
		Empleado empleados[] = new Empleado[5];
		empleados[0] = new Empleado();
		empleados[1] = new Comercial("Fernando", "Ureña", 23, 700, 50);
		empleados[2] = new Repartidor("Antonio", "Perez", 30, 800, "Este");
		empleados[3] = new Comercial("Laura", "Prerez", 24, 1000, 30);
		empleados[4] = new Repartidor("Rosa", "Serrano", 43, 1200, "Oeste");

		for (byte i = 0; i < empleados.length; i++) {
			if (empleados[i] instanceof Empleado)
				System.out.println("El objeto en el indice " + i
						+ " es de la clase Empleado");
			if (empleados[i] instanceof Comercial)
				System.out.println("El objeto en el indice " + i
						+ " es de la clase Comercial");
			if (empleados[i] instanceof Repartidor)
				System.out.println("El objeto en el indice " + i
						+ " es de la clase repartidor");
		}

		// Ejecutar dentro de un array un método que no está en la clase padre,
		// también sirve para interfaces
		for (byte i = 0; i < empleados.length; i++) {
			if (empleados[i] instanceof Comercial) {
				Comercial ref = (Comercial) empleados[i];// Casting de objetos
				System.out.println("La comision es de " + ref.getComision());
			}
			if (empleados[i] instanceof Repartidor) {
				Repartidor ref = (Repartidor) empleados[i];
				System.out.println("La zona es " + ref.getZona());
			}
		}

	}

}
