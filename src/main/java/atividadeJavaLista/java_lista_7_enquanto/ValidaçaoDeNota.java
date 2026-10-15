package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ValidaçaoDeNota {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe uma nota");
		double nota = sc.nextDouble();
		
		while (nota > 0 || nota < 10){
			System.out.print("Valor inválido. Introduza uma nota entre 0 e 10: ");
			
			nota = sc.nextDouble();
			
			JOptionPane.showMessageDialog(frame,
					"Nota Valida " + nota,
					"Exercicio 11",
					JOptionPane.QUESTION_MESSAGE);
			
		}
		sc.close();
		frame.dispose();
	}
}
