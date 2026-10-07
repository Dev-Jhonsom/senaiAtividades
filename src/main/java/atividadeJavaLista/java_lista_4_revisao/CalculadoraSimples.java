package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSimples {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.print("Informe o primeiro número ");
		int numero1 = sc.nextInt();
		System.out.print("Informe o segundo número ");
		int numero2 = sc.nextInt();
		System.out.print("Informe *, +, - ou / para multiplicar, adicionar, subtrair ou dividir, respectivamente ");
		String sinal = sc.next();
		int resultado = 0;
		
		if (sinal.equals("+")) {
			resultado = numero1 + numero2;
		}
		else if (sinal.equals("-")) {
			resultado = numero1 - numero2;
		}
		else if (sinal.equals("*")) {
			resultado = numero1 * numero2;
		}
		else if (sinal.equals("/")) {
			resultado = numero1 / numero2;
		}
		else {
			JOptionPane.showMessageDialog(frame,
					"Sinal inválido",
					"Exercicio 6",
					JOptionPane.QUESTION_MESSAGE);
			System.exit(0);
		}
		
		JOptionPane.showMessageDialog(frame,
				"Resultado: " + resultado,
				"Exercicio 6",
				JOptionPane.QUESTION_MESSAGE);
		
		
		frame.dispose();
		sc.close();
	}
}
