package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MaiorEMenorValor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int maiorValor = 0;
		int menorValor = 0;
		int numero = -1;
		boolean primeiraVez = true;

		while (numero != 0) {
			System.out.println("Informe um número");
			numero = sc.nextInt();
			if (numero != 0) {
				if (primeiraVez) {
					maiorValor = numero;
					menorValor = numero;
					primeiraVez = false;
				}
				else {
					if (numero > maiorValor) {
						maiorValor = numero;
					}
					if (numero < menorValor) {
						menorValor = numero;
					}
				}
			}
			
		}
		
		JOptionPane.showMessageDialog(
				frame,
				"Maior valor digitado: " + maiorValor + "\n" +
				"Menor valor digitado: " + menorValor,
				"Atividade 6",
				JOptionPane.QUESTION_MESSAGE
		);
		
		
		sc.close();
		frame.dispose();
	}
}
