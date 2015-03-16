package numerosPrimos;
/**
 * Clase VerificarPrimos
 * Esta clase contiene un método que verifica si un número es primo o no
 * 
 * @author Hider Rodi
 *
 */
public class VerificarPrimos {
	/**
	 * Este método verifica si el número pasado como parámetro es o no un número primo
	 * @param numero
	 * Número a ser verificado
	 * @return<ul>
	 * 			<li>true: Significa que el número es primo</li>
	 * 			<li>false: Significa que el número no es primo</li>
	 * 		  </ul>
	 */
	public static boolean numeroPrimo(int numero){
		int div = 2;
		while (div <= numero)
			if (numero % div == 0) {
				if (numero == div)
					return true;
				else
					break;
			} else
				div++;
		return false;
	}
}
