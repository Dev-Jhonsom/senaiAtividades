package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CalculoDePotencia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		int base ;
		int expoente ;
		
		System.out.println("Informe um numero para base");
		base = sc.nextInt();
		
		System.out.println("Informe um expoente");
		expoente = sc.nextInt();
		
		int soma = base;
		
		while (contador != expoente){
			System.out.println("Loop " + contador);
			
			System.out.println("Vai fazer: soma = " + soma + " * " + base );
			soma = soma * base ;
			System.out.println("soma atual: " + soma);
			
			 contador ++;
		}
		
		JOptionPane.showMessageDialog(frame,
				"Potência " +  base + " ^ " +  expoente + " = " + soma,
				"Atividade 3",
				
				
				JOptionPane.QUESTION_MESSAGE);
		
	}
}