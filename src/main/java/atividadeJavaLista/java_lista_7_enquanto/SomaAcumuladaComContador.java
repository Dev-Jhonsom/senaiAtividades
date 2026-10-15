package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SomaAcumuladaComContador {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numero = -1;
		int soma = 0;
		int contador = 0;
		
		while (numero != 0) {
			System.out.println("Informe um número");
			numero = sc.nextInt();
			if (numero != 0) {
				soma += numero;
				contador++;
			}
		}
		
		JOptionPane.showMessageDialog(
				frame,
				"Soma dos valores: " + soma + "\n" +
						"quantidade de números informados: " + contador + "\n" +
						"Média dos valores informados: " + (soma / contador),
				"Atividade 13",
				JOptionPane.QUESTION_MESSAGE
		);
		
		
		sc.close();
		frame.dispose();
	}
}
