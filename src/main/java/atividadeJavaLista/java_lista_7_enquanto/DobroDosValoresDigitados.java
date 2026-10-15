package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class DobroDosValoresDigitados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		
		int numero = -1;
		
		while (numero != 0) {
			System.out.println("Informe um número, ou digite 0 para parar");
			numero = sc.nextInt();
			if (numero != 0) {
				JOptionPane.showMessageDialog(
						frame,
						"Valor digitado: " + numero + ", valor Dobrado: " + (numero * 2),
						"Atividade 5",
						JOptionPane.QUESTION_MESSAGE
				);
			}
			else {
				JOptionPane.showMessageDialog(
						frame,
						"Interrompendo",
						"Atividade 5",
						JOptionPane.QUESTION_MESSAGE
				);
			}
		}
		
		
		
		
		
		sc.close();
		frame.dispose();
	}
}
