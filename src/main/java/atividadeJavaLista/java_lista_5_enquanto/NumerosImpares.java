package atividadeJavaLista.java_lista_5_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class NumerosImpares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		
		while (contador <= 50) {
			
			if (contador % 2 != 0) {
				
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Números impares: " + contador,
						"Exercicio 4",
						JOptionPane.QUESTION_MESSAGE);
				
			}
			
			contador++;
		}
		
		
		
		frame.dispose();
		sc.close();
	}
}
