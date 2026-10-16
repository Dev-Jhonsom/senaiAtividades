package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MediaDeNumerosPositivos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numero = 0;
		int soma = 0;
		int contador = 0;
		
		while (numero >= 0) {
			System.out.println("Informe um número, ou digite negativo para parar");
			numero = sc.nextInt();
			if (numero >= 0) {
				soma += numero;
				contador++;
			} else {
				JOptionPane.showMessageDialog(
						frame,
						"Interrompendo",
						"Atividade 4",
						JOptionPane.QUESTION_MESSAGE
				);
			}
		}
		
		JOptionPane.showMessageDialog(
				frame,
				"Média dos valores informados: " + (soma / contador),
				"Atividade 4",
				JOptionPane.QUESTION_MESSAGE
		);
		
		
		sc.close();
		frame.dispose();
	}
}
