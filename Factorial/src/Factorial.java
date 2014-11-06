import java.util.Scanner;
/**
 * Clase que calcula el factorial de un n�mero
 * 
 * @author Marc Trallero Garc�a
 * @version 1.2/2014
 */
public class Factorial {
	/**
	 * Calcula el factorial de un numero (n).
	 * n! = n* (n-1)*(n-2)*(n-3)*...* 1 
	 * @param n es el n�mero al que se calcular� el factorial.
	 * 
	 * @return n! es el resultado del factorial de n
	 * 
	 */
	public static double factorial(double numero) {
		if (numero == 0)
			return 1;
		else {
			double resultat = numero * factorial(numero - 1);
			return resultat;
		}
	}
	/**
	 * Programa principal.
	 * 
	 * @param Valor introducido por teclado entre 0 y 170
	 * 
	 */
	
	public static void main(String[] args) {

		System.out.println("Introdueix un n�mero:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println(factorial(num));
		
		scan.close();
	}
}
