package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class TotalizadorDeCompras {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		
		double total = 0;
		
		while (true) {
			System.out.println("Informe o preço da próxima mercadoria, ou digite um número negativo para parar");
			double valor = sc.nextDouble();
			
			if (valor < 0) {
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Compra finalizada, total: R$"+total,
						"Atividade 5",
						
						
						JOptionPane.QUESTION_MESSAGE);
				frame.dispose();
				sc.close();
				System.exit(0);
				
			}
			else {
				total += valor;
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Produto adicionado, total até agora: R$"+total,
						"Atividade 5",
						
						
						JOptionPane.QUESTION_MESSAGE);
				
			}
		}
		
		
		
	}
}
