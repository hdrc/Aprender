package numerosPrimos;
/**
 * Clase VerificarPrimos
 * Esta clase contiene un m�todo que verifica si un n�mero es primo o no
 * 
 * @author Hider Rodi
 *
 */
public class VerificarPrimos {
	/**
	 * Este m�todo verifica si el n�mero pasado como par�metro es o no un n�mero primo
	 * @param numero
	 * N�mero a ser verificado
	 * @return<ul>
	 * 			<li>true: Significa que el n�mero es primo</li>
	 * 			<li>false: Significa que el n�mero no es primo</li>
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
