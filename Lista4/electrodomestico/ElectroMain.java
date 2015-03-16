package electrodomestico;

public class ElectroMain {

	public static void main(String[] args) {
		Electrodoméstico electros[]=new Electrodoméstico[10];
		electros[0]=new Electrodoméstico(10, 75, "Gris", 'A');
		electros[1]=new Lavadora(120, 50, "Rojo", 'B', 35);
		electros[2]=new Televisión(14, true, 200, 1, "Negro", 'B');
		electros[3]=new Electrodoméstico(100, 2);
		electros[4]=new Lavadora(250, 35);
		electros[5]=new Televisión(180, 2);
		electros[6]=new Electrodoméstico();
		electros[7]=new Lavadora();
		electros[8]=new Televisión();
		electros[9]=new Electrodoméstico(100, 1, "Azul",'F');
		
		System.out.println("Electrodomésticos");
		int totalElectrodomésticos=0;
		for(byte i=0;i<electros.length;i++){
			int precio=electros[i].precioFinal();
			if(electros[i]instanceof Lavadora||electros[i]instanceof Televisión){
				i++;
			}else if(electros[i]instanceof Electrodoméstico){
				System.out.println(electros[i]);
				totalElectrodomésticos=totalElectrodomésticos+precio;
			}
		}
		System.out.println("Total Electrodomésticos="+totalElectrodomésticos);
		
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
			if(electros[i]instanceof Televisión){
				System.out.println(electros[i]);
				totalTeles=totalTeles+precio;
			}
		}
		System.out.println("Total teles="+totalTeles);
		int totalGeneral=totalElectrodomésticos+totalLavadoras+totalTeles;
		System.out.println("---------------------------------");
		System.out.println("La suma de todos los precios es: "+totalGeneral);
	}
}