package listaEjercicios1;

import numerosPrimos.VerificarPrimos;

public class ListaMain {
	public static void main(String[] args) {

		System.out.println(VerificarPrimos.numeroPrimo(3));
		
		Operaciones o = new Operaciones();
		o.oper();
		o.calculadora();
		new IntroNombre();

		new Circulo();

		Divisible2 divisible = new Divisible2();
		divisible.comprobar();

		new CaracterAscii();

		new ListasNumeros();

		new Ventas();

		new Ecuaciones();

		new Contraseña();

		new DiaLaboral();

		new Sevilla();
	}
}