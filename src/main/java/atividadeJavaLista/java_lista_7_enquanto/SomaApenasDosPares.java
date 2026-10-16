package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SomaApenasDosPares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		int soma = 0;
		int numero = -1;
		
		while (numero != 0) {
			System.out.println("Informe um número");
			numero = sc.nextInt();
			
			if (numero != 0 && numero % 2 == 0) {
				soma += numero;
			}
		}
		
		javax.swing.JOptionPane.showMessageDialog(frame,
				"Soma dos Números pares: " + soma,
				"Exercicio 17",
				JOptionPane.QUESTION_MESSAGE);
		frame.dispose();
		sc.close();
	}
}
