package escrituraLecturaDeFicheros;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializaciónLecturaApp {

	public static void main(String[] args){
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\empleados.txt"))){
			while(true){
				//Leer un fichero
				EmpleadoSerializable aux=(EmpleadoSerializable)ois.readObject();
				System.out.println(aux.getNombre());
				System.out.println(aux.getApellido());
				System.out.println(aux.getEdad());
				System.out.println(aux.getSalario());
				System.out.println("");
			}
		}catch(ClassNotFoundException e){
		}catch(EOFException e){
		}catch(IOException e){
		}
	}
}