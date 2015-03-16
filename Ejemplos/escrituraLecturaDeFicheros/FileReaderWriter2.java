package escrituraLecturaDeFicheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Otra forma de usar FileReader y FileWriter
public class FileReaderWriter2 {

	public static void main(String[] args) {

		// Abrir los streams de escritura y lectura de ficheros
		try (FileWriter fw = new FileWriter("E:\\fichero2.txt");
				FileReader fr = new FileReader("E:\\fichero2.txt")) {

			// Escribir en el fichero
			fw.write("Esto es una prueb");// Un String
			fw.write(97);// Un caracter

			// Guardar los cambios del fichero
			fw.flush();

			// Leer el fichero y mostrar en pantalla
			int valor = fr.read();
			while (valor != -1) {
				System.out.print((char) valor);
				valor = fr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}