package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _19_JogoDeAdivinhacaoComDicaDeParidade {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numeroSecreto = 42;
		int palpite;
		
		do {
			System.out.println("Tente adivinhar o número secreto");
			palpite = sc.nextInt();
			String resultado;
			
			if (palpite > numeroSecreto) {
				resultado = "Seu palpite é maior que o número secreto";
			} else if (palpite < numeroSecreto) {
				resultado = "Seu palpite é menor que o número secreto";
			} else {
				resultado = "Você acertou o número secreto!";
			}
			
			if (palpite % 2 == 0) {
				resultado += "\nO palpite digitado é par";
			} else {
				resultado += "\nO palpite digitado é ímpar";
			}
			
			JOptionPane.showMessageDialog(frame,
					resultado,
					"Atividade 19",
					JOptionPane.QUESTION_MESSAGE);
		} while (palpite != numeroSecreto);
		
		sc.close();
		frame.dispose();
	}
}
