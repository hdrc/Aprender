package mi;

public class Repetir {

	public static void main(String[] args) {
		// while
		int x = 0, y = 0;
		while (x != 5) {
			System.out.println(x);
			x++;
		}

		System.out.println("_________________________");

		for (int n = 0; n != 5; n++)
			System.out.println(n);

		System.out.println("__________________________");
		do {
			System.out.println(y);
			y++;
		} while (y != 5);
	}

}
