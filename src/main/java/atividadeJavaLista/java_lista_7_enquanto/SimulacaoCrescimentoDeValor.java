package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SimulacaoCrescimentoDeValor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe um número qualquer menor que 1000");
		double numero = sc.nextInt();
		
		if (numero >= 1000 || numero < 0) {
			JOptionPane.showMessageDialog(frame,
					"Número inválido, é preciso ser menor que mil e maior que zero",
					"Exercicio 11",
					JOptionPane.QUESTION_MESSAGE);
			System.exit(0);
		}
		
		int contador = 0;
		
		while (numero < 1000) {
			
			numero = numero + (numero * 0.05);
			System.out.println("numero aumentou para: " + numero);
			contador++;
		}
		JOptionPane.showMessageDialog(frame,
				"Quantidade de repetições pra checar a mil: " + contador,
				"Exercicio 11",
				JOptionPane.QUESTION_MESSAGE);
		
		frame.dispose();
		sc.close();
	}
}
