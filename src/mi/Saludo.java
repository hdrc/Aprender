package mi;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		byte x,y,z;
		x=s.nextByte();
		y=s.nextByte();
		z=s.nextByte();
		if(x>y&&x>z){
			System.out.println(x+" es el mayor");
		}
		if(y>x&&y>z){
			System.out.println(y+" es el mayor");
		}
		if(z>x&&z>y){
			System.out.println(z+" es el mayor");
		}
	}
}
