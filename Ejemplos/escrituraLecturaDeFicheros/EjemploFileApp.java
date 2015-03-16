package escrituraLecturaDeFicheros;

import java.io.File;
import java.io.IOException;

//La clase File representa un fichero o directorio
public class EjemploFileApp {
	public static void main(String[] args) throws IOException {
		//Crear objetos File
		File fichero=new File("E:\\fichbin.ddr");
		File fichero2=new File("E:\\fiichero.txt");
		File directorio=new File("E:\\");
		File directorio2=new File("E:\\directorio");
		
		//Indicar si existen los archivos
		System.out.println("Existencia:");
		System.out.println("Fichero "+fichero.exists());
		System.out.println("Directorio "+directorio.exists()+"\n");
		
		//Indicar si son directorios
		System.out.println("¿Son directorios?:");
		System.out.println("Fichero "+fichero.isDirectory());
		System.out.println("Directorio "+directorio.isDirectory()+"\n");
		
		//Indicar si son ficheros
		System.out.println("¿Son ficheros?:");
		System.out.println("Fichero "+fichero.isFile());
		System.out.println("Directorio "+directorio.isFile()+"\n");
		
		//Guardar en un array de File los directorios hijos
		System.out.println("Nombre de los objetos File dentro de un array");
		File lista[]=directorio.listFiles();
		for(byte i=0;i<lista.length;i++){
			System.out.println(lista[i]);
		}
		System.out.println("");
		
		//Crear un directorio (si no existe)
		System.out.println("Creando directorio...");
		System.out.println(directorio2.mkdir());
		
		//Crear un fichero (si no extiste)
		System.out.println("Creando fichero...");
		System.out.println(fichero2.createNewFile());
	}
}