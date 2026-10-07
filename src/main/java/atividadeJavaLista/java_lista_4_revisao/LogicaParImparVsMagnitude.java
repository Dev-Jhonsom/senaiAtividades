package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class LogicaParImparVsMagnitude {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.print("Informe um número:");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0 && numero < 100) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Número é par e menor que 100",
					"Exercicio 11",
					JOptionPane.QUESTION_MESSAGE);
		}
		else if (numero % 2 == 1 && numero > 100) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Número é ímpar e maior que 100",
					"Exercicio 11",
					JOptionPane.QUESTION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(frame,
					"Número informado não encaixa em nenhum dos critérios",
					"Exercicio 11",
					JOptionPane.QUESTION_MESSAGE);
		}
		
		
		frame.dispose();
		sc.close();
	}
}
