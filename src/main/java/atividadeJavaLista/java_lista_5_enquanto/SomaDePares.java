package atividadeJavaLista.java_lista_5_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SomaDePares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numeP = 0 ;
		int contador = 1 ;
		
		while (contador <= 50){
			if (contador % 2 == 0){
				numeP = numeP + 1;
			}
			contador ++;
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"À soma dos Números pares é: " + numeP,
					"Exercicio 9",
					JOptionPane.QUESTION_MESSAGE);
			
			
			
		}
		
		
		
		frame.dispose();
		sc.close();
	}
}
