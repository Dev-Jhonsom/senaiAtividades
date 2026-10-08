package atividadeJavaLista.java_lista_5_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ContagemRegressiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 20;
		
		while (contador != 0){
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Contagem: " + contador,
					"Exercicio 2",
					JOptionPane.QUESTION_MESSAGE);
			
			
			contador --;
			
		}
		
		
		
		
		
		
		
		
		frame.dispose();
		sc.close();
	}
}
