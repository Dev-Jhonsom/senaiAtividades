package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class IntervaloNumerico {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		double numero = -1;
		int cont = 0;
		
		while (numero != 0) {
			System.out.print("Informe um numero: ");
			
			numero = sc.nextDouble();
			if (numero >= 10 && numero <= 50) {
				cont++;
				
			}
		}
		
		JOptionPane.showMessageDialog(frame,
				"Estão entre 10 e 50 : " + cont,
				"Exercicio 16",
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
	}
}
