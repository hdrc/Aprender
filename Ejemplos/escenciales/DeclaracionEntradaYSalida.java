package escenciales;

import javax.swing.JOptionPane;

public class DeclaracionEntradaYSalida {

	public static void main(String[] args) {

		int a = 30;
		int b = 60;
		short c = 20;
		int suma = a + b + c;
		System.out.println(suma);

		// si las variables son del mismo tipo se pudeden
		// declarar en una sola línea
		int d = 30, e = 60, f = 20;
		int suma2 = d + e + f;
		System.out.println(suma2);

		int precioProducto = 300;

		final double IVA = 0.21;

		// System.out.println muestra en la consola lo que está en paréntesis
		System.out.println("Información del producto");
		System.out.println("el preio del producto es " + precioProducto);

		// En System.out.println también se pueden incluir fórmulas
		System.out.println("el precio del producto, incluyendo el IVA, es"
				+ (precioProducto + precioProducto * IVA));

		// Para mostrar información en un cuadro de diálogo se usa
		// JOptionPane.showMessageDialog
		JOptionPane.showMessageDialog(null,
				"el precio del producto, incluyendo el IVA, es"
						+ (precioProducto + precioProducto * IVA));

		// Para mostrar un cuadro de entrada de información se usa
		// JOptionPane.showInputDialog
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Tu nombre es " + nombre);

		// Procedimiento para hacer operaciones con números del cuadro de
		// entrada
		String texto_num = JOptionPane
				.showInputDialog("Introduce el precio del producto");
		int precio = Integer.parseInt(texto_num);

		JOptionPane.showMessageDialog(null,
				"el precio del producto, incluyendo el IVA, es"
						+ (precio + precio * IVA));
	}

}
