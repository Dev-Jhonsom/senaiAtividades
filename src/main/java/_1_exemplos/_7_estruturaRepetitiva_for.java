package _1_exemplos;

import java.util.Locale;
import java.util.Scanner;

public class _7_estruturaRepetitiva_for {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 5 números: ");
		
		System.out.print("1º Número: ");
		
		int entradaMenor = sc.nextInt();
		
		for (int i = 2; i <= 5; i++){
			System.out.print("º Número: ");
			int entradaAtual = sc.nextInt();
			if (entradaAtual < entradaMenor){
				entradaMenor = entradaAtual;
			}
		}
		System.out.println("O menor número é : " + entradaMenor);
		sc.close();
	}
}
