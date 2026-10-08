package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class DivisibilidadeTripla {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe um número qualquer!:");
		double numero = sc.nextInt();
		
		if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Número informado é divisível por 2, 3 e 5 ao mesmo tempo",
					"Exercicio 14",
					JOptionPane.QUESTION_MESSAGE);
		}
		else {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Número informado não é divisivel 2, 3 e 5 ao mesmo tempo",
					"Exercicio 14",
					JOptionPane.QUESTION_MESSAGE);
		}
		
		
		
		frame.dispose();
		sc.close();
	}
}
