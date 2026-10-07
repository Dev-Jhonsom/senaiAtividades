package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class IntervaloNumerico {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.print("Informe um número:");
		int numero = sc.nextInt();
		
		if (numero >= 100 && numero <= 200) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Está entre 100 e 200",
					"Exercicio 5",
					JOptionPane.QUESTION_MESSAGE);
		}
		else if (numero < 100) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"É menor que 100",
					"Exercicio 5",
					JOptionPane.QUESTION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(frame,
					"É menor que 200",
					"Exercicio 5",
					JOptionPane.QUESTION_MESSAGE);
		}
		
		
		frame.dispose();
		sc.close();
	}
}
