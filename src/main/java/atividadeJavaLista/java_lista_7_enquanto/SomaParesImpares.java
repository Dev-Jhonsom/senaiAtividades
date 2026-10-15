package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SomaParesImpares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numero = -1;
		int somaPares = 0;
		int somaImpares = 0;
		
		while (numero != 0) {
			System.out.println("Informe um número, ou digite 0 para cancelar");
			numero = sc.nextInt();
			
			if (numero != 0) {
				if (numero % 2 == 0) {
					somaPares += numero;
				}
				if (numero % 2 != 0) {
					somaImpares += numero;
					
				}
			}
		}
		
		javax.swing.JOptionPane.showMessageDialog(frame,
				"Soma dos números pares: " + somaPares + "\n" +
				"Soma dos números impares: " + somaImpares,
				"Exercicio 10",
				JOptionPane.QUESTION_MESSAGE);
		frame.dispose();
		sc.close();
	}
}
