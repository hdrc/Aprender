package escrituraLecturaDeFicheros;

/* Las clases FileReader y FileWriter sirven para leer y escribir ficheros, para usar estas clases, hay que escribir esto:*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) {
		// Ejemplo de uso de FileWriter y FileReader
		try {
			// Abrir un strean para escribir un fichero, crea un fichero si no
			// existe
			FileWriter fw = new FileWriter("E:\\fichero1.txt");

			// Escribir en el fichero:
			fw.write("Esto es una prueb");// Un String
			fw.write(97);// Un caracter

			// Cerrar el stream
			fw.close();

			// Abrir un stream para leer un fichero, el fichero tiene que
			// existir
			FileReader fr = new FileReader("E:\\fichero1.txt");

			// Leer el fichero y mostrar en pantalla
			int valor = fr.read();
			while (valor != -1) {
				System.out.print((char) valor);
				valor = fr.read();
			}
			// Cerrar el stream
			fr.close();
		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}
	}
}