package _1_exemplos;

import java.util.Locale;
import java.util.Scanner;

public class _4_estruturaRepetitiva_Do_While {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		
		do {
			System.out.println("Digite a temperatura em Celsius:");
			double c = sc.nextDouble();
			double f = 9 * c / 5 + 32;
			System.out.printf("Equivalente em Farenheit: %.1f%n",f);
			System.out.println("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
		sc.close();
	}
}