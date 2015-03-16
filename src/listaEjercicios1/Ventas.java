package listaEjercicios1;

import javax.swing.JOptionPane;

public class Ventas {

	void calcularIVA() {
		String intro_precio = JOptionPane
				.showInputDialog("Precio del producto");
		int precio = Integer.parseInt(intro_precio);

		final double IVA = 0.10;
		double ivaPrecio = precio * IVA;
		double precioFinal = precio + ivaPrecio;

		System.out.println("El precio del producto con IVA es: " + precioFinal);
	}

	void sumarVentas() {
		String texto_ventas = JOptionPane.showInputDialog("Cantidad de ventas");
		int ventas = Integer.parseInt(texto_ventas);

		int sumaVentas = 0;

		for (byte i = 1; i <= ventas; i++) {
			String texto_venta = JOptionPane.showInputDialog("Venta" + i);
			int venta = Integer.parseInt(texto_venta);

			System.out.println("Venta" + i + "=" + venta);
			sumaVentas = sumaVentas + venta;
		}
		System.out.println("Total de ventas=" + sumaVentas);
	}
}
