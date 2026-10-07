package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MultiplosCombinados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número");
		int numero = sc.nextInt();
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		if (numero % 7 == 0) {
			JOptionPane.showMessageDialog(frame,
					"Número é múltiplo de 7",
					"Exercicio 7",
					JOptionPane.QUESTION_MESSAGE);
			
		}
		if (numero % 11 == 0) {
			JOptionPane.showMessageDialog(frame,
					"Número é múltiplo de 11",
					"Exercicio 7",
					JOptionPane.QUESTION_MESSAGE);
			
		}
		
	
		
		frame.dispose();
		sc.close();
	}
}
