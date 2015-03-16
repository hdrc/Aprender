package usoClasesJava;

import javax.swing.JOptionPane;

public class ArrayObjetos {

	public static void main(String[] args) {
		// Crear un array de objetos, en este caso, de la clase empleado
		Empleado arrayObjetos[]=new Empleado[3];
		
		//Crear un objeto en cada posición
		arrayObjetos[0]=new Empleado("Fernando","Ureña",23,1000);
		arrayObjetos[1]=new Empleado("Epi", "Dermis", 30, 1500);
		arrayObjetos[2]=new Empleado("Blas", "Femia", 25, 1200);
		
		//Recorrer el array para calcular la suma de los salarios
		int suma=0;
		for(byte i=0;i<arrayObjetos.length;i++){
			suma+=arrayObjetos[i].getSalario();
		}
		System.out.println("La suma de salarios es "+suma);
		
		String tCantidad=JOptionPane.showInputDialog("¿Cuántos empleados son?");
		byte cantidad=Byte.parseByte(tCantidad);
		
		//Crear un array de objetos pidiendo los datos de cada objeto por teclado
		Empleado arrayObjetos2[]=new Empleado[cantidad];
		
		for(byte i=0;i<arrayObjetos2.length;i++){
			String nombre=JOptionPane.showInputDialog("Escribir el nombre");
			String apellido=JOptionPane.showInputDialog("Escribir el apellido");
			String tEdad=JOptionPane.showInputDialog("Escribir la edad");
			String tSalario=JOptionPane.showInputDialog("Escribir el salario");
			byte edad=Byte.parseByte(tEdad);
			int salario=Integer.parseInt(tSalario);
			
			arrayObjetos2[i]=new Empleado(nombre, apellido, edad, salario);
		}
		
		//Recorrer el array y sumar los salarios
		int s=0;
		for(byte i=0;i<arrayObjetos2.length;i++){
			//Mostrar los datos de cada objeto creado(invoca el método toString)
			System.out.println(arrayObjetos2[i]);
			s+=arrayObjetos2[i].getSalario();
		}
		System.out.println("La suma de salarios es "+ s);
	}
}