package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CondicoesDePagamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.print("Informe o valor do produto: ");
		double numero = sc. nextDouble();
		
		System.out.println("Informe o código de pagamento");
		int codigo = sc.nextInt();
		
		if (codigo == 1) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Pagamento a vista, desconto de 10%, valor total: " + (numero - (numero * 0.10)),
					"Exercicio 12",
					JOptionPane.QUESTION_MESSAGE);
		}
		else if (codigo == 2) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Pagamento no cartão, desconto de 5%, valor total: " + (numero - (numero * 0.05)),
					"Exercicio 12",
					JOptionPane.QUESTION_MESSAGE);
		}
		else if (codigo == 3) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Pagamento em 2x, preço normal, valor total: " + numero,
					"Exercicio 12",
					JOptionPane.QUESTION_MESSAGE);
		}
		
		
		
		frame.dispose();
		sc.close();
	}
}
