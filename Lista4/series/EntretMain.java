package series;

import java.util.Arrays;

public class EntretMain {

	public static void main(String[] args) {
		//Series
		Serie s[]=new Serie[5];
		s[0]=new Serie();
		s[1]=new Serie("Naruto", "Masashi Kishimoto");
		s[2]=new Serie("One Piece",(byte)6, "Acción", "Eiichiro Oda");
		s[3]=new Serie("DragonBall",(byte)8, "Acción", "Akira Toriyama");
		s[4]=new Serie("Jaspion", (byte)2, "Acción", "no sé");
		
		s[0].entregar();
		s[2].entregar();
		s[4].entregar();
		
		int seriesEntregadas=0;
		for(byte i=0;i<s.length;i++){
			if(s[i].isEntregado()==true){
				seriesEntregadas++;	
			}
		}
		System.out.println("Hay "+seriesEntregadas+" series entregadas");
		
		Serie sMayor=s[0];
		Serie sMenor=s[0];
		for(byte i=1;i<s.length;i++){
			if(s[i].compareTo(sMayor)==Serie.MAYOR){
				sMayor=s[i];
			}else if(s[i].compareTo(sMenor)==Serie.MENOR){
				sMenor=s[i];
			}
		}
		System.out.println("La serie com más temporadas:");
		System.out.println(sMayor);
		System.out.println("La serie con menos temporadas:");
		System.out.println(sMenor);
		
		
		//Videojuegos
		System.out.println("-------------------------------------------------------------");
		Videojuego v[]=new Videojuego[5];
		v[0]=new Videojuego();
		v[1]=new Videojuego("Top Gear",(byte)8);
		v[2]=new Videojuego("Mario", (byte)10, "Plataformas", "Nintentdo");
		v[3]=new Videojuego("Donkey Kong", (byte)20, "Plataformas", "Nintendo");
		v[4]=new Videojuego("Mega Man", (byte)40);
		
		v[0].entregar();
		v[2].entregar();
		v[4].entregar();
		
		int videojuegosEntregados=0;
		for(byte i=0;i<v.length;i++){
			if(v[i].isEntregado()==true){
				videojuegosEntregados++;
			}
		}
		System.out.println("Hay "+videojuegosEntregados+ " videojuegos entregados");
		
		Videojuego vMayor=v[0];
		Videojuego vMenor=v[0];
		for(byte i=1;i<s.length;i++){
			if(v[i].compareTo(vMayor)==Videojuego.MAYOR){
				vMayor=v[i];
			}else if(v[i].compareTo(vMenor)==Videojuego.MENOR){
				vMenor=v[i];
			}
		}
		System.out.println("El videojuego que dura mas es:");
		System.out.println(vMayor);
		System.out.println("El videojuego que dura menos es:");
		System.out.println(vMenor);
	}
}
