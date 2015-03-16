package escrituraLecturaDeFicheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {
	// Este es otro método para leer y escribir ficheros binarios
	public static void main(String[] args) {

		// Escribir:
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(
				"E:\\fichbin.ddr"));) {

			// Escribir un número
			dos.writeInt(23);

			// Escribir una cadena
			dos.writeUTF("Fernando");

			dos.writeInt(1990);
		} catch (IOException e) {
			System.out.println("Error E/S");
		}

		// Leer:
		try (DataInputStream dis = new DataInputStream(new FileInputStream(
				"E:\\fichbin.ddr"));) {

			// Leer y mostrar un número:
			System.out.println(dis.readInt());

			// Leer y mostrar una cadena:
			System.out.println(dis.readUTF());

			// Leer y mostrar un numero:
			System.out.println(dis.readInt());

			dis.readInt();
		} catch (EOFException e) {
			System.out.println("Fin del fichero");
		} catch (IOException e) {
			System.out.println("Error E/S");
		}
	}
}