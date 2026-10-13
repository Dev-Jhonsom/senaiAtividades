package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		
		double prova = -1;
		
		while (prova < 0 || prova > 10) {
			System.out.println("Informe a nota da prova entre 0 e 10!");
			prova = sc.nextDouble();
			
			if (prova < 0 || prova > 10) {
				
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Nota inválida, nota precisa ser entre 0 e 10",
						"Atividade 1",
						
						
						JOptionPane.QUESTION_MESSAGE);
			}
			else {
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Nota válida",
						"Atividade 1",
						
						
						JOptionPane.QUESTION_MESSAGE);
			}
		}
		
		frame.dispose();
		sc.close();
	}
}
