package string;

public class StringAVariable {

	public static void main(String[] args) {

		// Métodos para convertir una string en una variable primitiva
		String numString = "123";
		System.out.println("String: " + numString);

		long numLong = Long.parseLong(numString);
		System.out.println("long: " + numLong);

		int numInt = Integer.parseInt(numString);
		System.out.println("int: " + numInt);

		short numShort = Short.parseShort(numString);
		System.out.println("short: " + numShort);

		byte numByte = Byte.parseByte(numString);
		System.out.println("byte: " + numByte);

		double numDouble = Double.parseDouble(numString);
		System.out.println("double: " + numDouble);

		float numFloat = Float.parseFloat(numString);
		System.out.println("Float: " + numFloat);

	}

}
