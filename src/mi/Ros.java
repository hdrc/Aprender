package mi;

public class Ros {

	public static void main(String[] args) {
		int c1 = 1, c2 = 1;
		do {
			System.out.println(c1 + " Padre nuestro");
			c1++;
			do {
				System.out.println(c2 + " Dios te salve");
				c2++;
			} while (c2 <= 10);
			System.out
			.println("----------------------------------------------");
			c2 = 1;
		} while (c1 <= 5);

	}

}
