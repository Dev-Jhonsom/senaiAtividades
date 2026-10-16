package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MediaCondicionada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numero = -1;
		int soma = 0;
		int contador = 0;
		
		while (numero != 0) {
			System.out.println("Informe um número, ou digite negativo para parar");
			numero = sc.nextInt();
			if (numero > 100) {
				soma += numero;
				contador++;
			} else if (numero == 0) {
				JOptionPane.showMessageDialog(
						frame,
						"Interrompendo",
						"Atividade 19",
						JOptionPane.QUESTION_MESSAGE
				);
			}
		}
		
		JOptionPane.showMessageDialog(
				frame,
				"Média dos valores maiores que 100 informados: " + (soma / contador),
				"Atividade 19",
				JOptionPane.QUESTION_MESSAGE
		);
		
		
		sc.close();
		frame.dispose();
	}
}
