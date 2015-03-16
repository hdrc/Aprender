package escrituraLecturaDeFicheros;

import java.io.*;

public class SerializaciónEscrituraApp {

	public static void main(String[] args){
		//Crear los objetos
		EmpleadoSerializable empleado1=new EmpleadoSerializable("Fernando","Ureña", 23, 800);
		EmpleadoSerializable empleado2=new EmpleadoSerializable("Antonio", "Lopez", 35, 1000);
		EmpleadoSerializable empleado3=new EmpleadoSerializable("Hider", "Rodi", 26,1800);
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\empleados.txt"))){
			//Escribir en un fichero
			oos.writeObject(empleado1);
			oos.writeObject(empleado2);
			oos.writeObject(empleado3);
		}catch(IOException e){
		}
		
	}
}