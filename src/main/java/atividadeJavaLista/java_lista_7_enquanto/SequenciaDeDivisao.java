package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SequenciaDeDivisao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe um número qualquer maior que 1");
		double numero = sc.nextInt();
		
		if (numero < 1) {
			JOptionPane.showMessageDialog(frame,
					"Número inválido, é preciso ser maior que 1 ",
					"Exercicio 12",
					JOptionPane.QUESTION_MESSAGE);
			System.exit(0);
		}
		
		int contador = 0;
		
		while (numero > 1 ) {
			numero = numero / 2;
			contador++;
		}
		JOptionPane.showMessageDialog(frame,
				"Quantidade de repetições: " + contador,
				"Exercicio 12",
				JOptionPane.QUESTION_MESSAGE);
		
		frame.dispose();
		sc.close();
	}
}
