package escrituraLecturaDeFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
	// FileOutputStream y FileInputStream sirven para escribir y leer ficheros
	// binarios
	public static void main(String[] args) {
		// Cómo escribir
		try (FileOutputStream fos = new FileOutputStream("E:\\fichero_bin.ddr")) {

			String texto = "Esto es una prueba para ficheros binariossssss";

			// Copiar el texto en un array de bytes
			byte codigos[] = texto.getBytes();

			fos.write(codigos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Cómo leer, ejemplo1
		try (FileInputStream fis = new FileInputStream("E:\\fichero_bin.ddr")) {
			int valor = fis.read();
			while (valor != -1) {
				System.out.print((char) valor);
				valor = fis.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(" ");
		}
		// Ejemplo2
		try (FileInputStream fis = new FileInputStream("E:\\Férias.jpg")) {
			int valor = fis.read();
			while (valor != -1) {
				System.out.print((char) valor);
				valor = fis.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}