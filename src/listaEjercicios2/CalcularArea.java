package listaEjercicios2;

import javax.swing.JOptionPane;

public class CalcularArea {

	public static double areaCirculo(double radio) {
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}

	public static double areaCuadrado(double lado) {
		double area = Math.pow(lado, 2);
		return area;
	}

	public static double areaTriangulo(double base, double altura) {
		double area = base * altura / 2;
		return area;
	}

	public static void main(String[] args) {
		String elegir = JOptionPane
				.showInputDialog("Escribir el nombre de una figura"
						+ "\nCírculo, triángulo o cuadrado, para calcular su Area");
		String respuesta = "El área del " + elegir + " es: ";
		if (elegir.equalsIgnoreCase("circulo")) {
			String tRadio = JOptionPane.showInputDialog("Radio");
			double radio = Double.parseDouble(tRadio);
			double area = areaCirculo(radio);
			JOptionPane.showMessageDialog(null, respuesta + area);

		} else if (elegir.equalsIgnoreCase("triangulo")) {
			String tBase = JOptionPane.showInputDialog("Base");
			String tAltura = JOptionPane.showInputDialog("Altura");
			double base = Double.parseDouble(tBase);
			double altura = Double.parseDouble(tAltura);
			double area = areaTriangulo(base, altura);
			JOptionPane.showMessageDialog(null, respuesta + area);

		} else if (elegir.equalsIgnoreCase("cuadrado")) {
			String tLado = JOptionPane.showInputDialog("Lado");
			double lado = Double.parseDouble(tLado);
			double area = areaCuadrado(lado);
			JOptionPane.showMessageDialog(null, respuesta + area);
		}
	}

}
