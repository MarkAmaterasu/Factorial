import java.util.Scanner;

public class Factorial {
	public static double factorial(double numero) {
		if (numero == 0)
			return 1;
		else {
			double resultat = numero * factorial(numero - 1);
			return resultat;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Introdueix un número:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println(factorial(num));
		
		scan.close();
	}
}
