package electrodomestico;

public class ElectroMain {

	public static void main(String[] args) {
		Electrodom�stico electros[]=new Electrodom�stico[10];
		electros[0]=new Electrodom�stico(10, 75, "Gris", 'A');
		electros[1]=new Lavadora(120, 50, "Rojo", 'B', 35);
		electros[2]=new Televisi�n(14, true, 200, 1, "Negro", 'B');
		electros[3]=new Electrodom�stico(100, 2);
		electros[4]=new Lavadora(250, 35);
		electros[5]=new Televisi�n(180, 2);
		electros[6]=new Electrodom�stico();
		electros[7]=new Lavadora();
		electros[8]=new Televisi�n();
		electros[9]=new Electrodom�stico(100, 1, "Azul",'F');
		
		System.out.println("Electrodom�sticos");
		int totalElectrodom�sticos=0;
		for(byte i=0;i<electros.length;i++){
			int precio=electros[i].precioFinal();
			if(electros[i]instanceof Lavadora||electros[i]instanceof Televisi�n){
				i++;
			}else if(electros[i]instanceof Electrodom�stico){
				System.out.println(electros[i]);
				totalElectrodom�sticos=totalElectrodom�sticos+precio;
			}
		}
		System.out.println("Total Electrodom�sticos="+totalElectrodom�sticos);
		
		System.out.println("");
		System.out.println("Lavadoras");
		int totalLavadoras=0;
		for(byte i=0;i<electros.length;i++){
			int precio=electros[i].precioFinal();
			if(electros[i]instanceof Lavadora){
				System.out.println(electros[i]);
				totalLavadoras=totalLavadoras+precio;
			}
		}
		System.out.println("Total lavadoras="+totalLavadoras);
		
		System.out.println("");
		System.out.println("Teles");
		int totalTeles=0;
		for(byte i=0;i<electros.length;i++){
			int precio=electros[i].precioFinal();
			if(electros[i]instanceof Televisi�n){
				System.out.println(electros[i]);
				totalTeles=totalTeles+precio;
			}
		}
		System.out.println("Total teles="+totalTeles);
		int totalGeneral=totalElectrodom�sticos+totalLavadoras+totalTeles;
		System.out.println("---------------------------------");
		System.out.println("La suma de todos los precios es: "+totalGeneral);
	}
}