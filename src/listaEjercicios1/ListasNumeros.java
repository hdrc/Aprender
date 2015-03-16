package listaEjercicios1;

public class ListasNumeros {

	void listaDivisibles2_3() {
		System.out.println("Lista de numeros divisibles entre 2 o 3");
		for (byte d = 1; d <= 100; d++)
			if (d % 2 == 0 || d % 3 == 0)
				if (d % 10 != 0)
					System.out.print(d + " ");
				else
					System.out.println(d + " ");
		System.out.println("");
	}

	void listaFor() {
		for (byte i = 1; i <= 10; i++)
			System.out.print(i + " ");
		System.out.println("");
	}

	void listaWhile() {
		byte r = 1;
		while (r <= 10) {
			System.out.print(r + " ");
			r++;
		}
		System.out.println("");
	}
}
