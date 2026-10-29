package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _20_CalculadoraDeTrocoEmMoedas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe o valor em centavos");
		int valor = sc.nextInt();
		int moedas25 = 0;
		int moedas10 = 0;
		int moedas5 = 0;
		int moedas1 = 0;
		
		if (valor >= 0) {
			do {
				if (valor >= 25) {
					moedas25 = valor / 25;
					valor = valor % 25;
				} else if (valor >= 10) {
					moedas10 = valor / 10;
					valor = valor % 10;
				} else if (valor >= 5) {
					moedas5 = valor / 5;
					valor = valor % 5;
				} else {
					moedas1 = valor;
					valor = 0;
				}
			} while (valor > 0);
			
			JOptionPane.showMessageDialog(frame,
					"Moedas de 25 centavos: " + moedas25 + "\n" +
					"Moedas de 10 centavos: " + moedas10 + "\n" +
					"Moedas de 5 centavos: " + moedas5 + "\n" +
					"Moedas de 1 centavo: " + moedas1,
					"Atividade 20",
					JOptionPane.QUESTION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(frame,
					"O valor em centavos não pode ser negativo",
					"Atividade 20",
					JOptionPane.QUESTION_MESSAGE);
		}
		
		sc.close();
		frame.dispose();
	}
}
