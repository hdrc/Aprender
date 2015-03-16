package numerosPrimos;

import java.util.Scanner;

public class PrimosMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int contador = 0;
		int div = 1;
		System.out.println("Escribir un número para verificar si es o no primo");
		int numero=s.nextInt();
		
		while (div <= numero) {
			
				if (numero % div == 0 && numero == div && contador == 0) {
					System.out.println("El número es primo");
					div=numero+1;
					}
				
				if(numero % div == 0 && div != 1){
					System.out.println(div);
					contador++;
				}
			div++;
		}
		
	}
	
}
