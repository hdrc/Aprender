package persona;

import javax.swing.JOptionPane;

public class PersonaMain {
	
	public static void MuestraIMC(Persona p){
		if(p.calcularIMC()==-1){
			System.out.println(p.getNombre()+" tiene bajo peso");
		}else if(p.calcularIMC()==0) {
			System.out.println("El peso de "+p.getNombre()+" es bueno");
		}else {
			if(p.getSexo()=='M'){
				System.out.println(p.getNombre()+" está gorda");
			}else {
				System.out.println(p.getNombre()+" está gordo");
			}
		}
	}
	public static void MuestraMayorMenor(Persona p){
		boolean mayor=p.esMayorDeEdad();
		if (mayor==true) {
			System.out.println(p.getNombre()+" es mayor de edad");
		}else {
			System.out.println(p.getNombre()+" no es mayor de edad");
		}
	}
	public static void informaciónCompleta(Persona p){
		System.out.println(p);
	}
	public static void main(String[] args) {
		String nombre=JOptionPane.showInputDialog("Nombre:");
		String tEdad=JOptionPane.showInputDialog("Edad:");
		byte edad=Byte.parseByte(tEdad);
		String tSexo=JOptionPane.showInputDialog("sexo\n(H o M)");
		char sexo=tSexo.charAt(0);
		String tPeso=JOptionPane.showInputDialog("Peso:");
		float peso=Float.parseFloat(tPeso);
		String tAltura=JOptionPane.showInputDialog("Altura:");
		float altura=Float.parseFloat(tAltura);	
	
		Persona persona1=new Persona(nombre, edad, sexo, peso, altura);
		Persona persona2=new Persona(nombre, edad, sexo);
		Persona persona3=new Persona();	
		
		persona2.setPeso(65);
		persona2.setAltura(1.60f);
		
		persona3.setNombre("Nando");
		persona3.setEdad((byte)18);
		persona3.setSexo('H');
		persona3.setPeso(80);
		persona3.setAltura(1.78f);
		
		System.out.println("Persona1");
		MuestraIMC(persona1);
		MuestraMayorMenor(persona1);
		informaciónCompleta(persona1);
		
		System.out.println("Persona2");
		MuestraIMC(persona2);
		MuestraMayorMenor(persona2);
		informaciónCompleta(persona2);
		
		System.out.println("Persona3");
		MuestraIMC(persona3);
		MuestraMayorMenor(persona3);
		informaciónCompleta(persona3);
	}
}