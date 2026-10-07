package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ClassificacaoDeIMC {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe a altura em metros: ");
		double altura = sc.nextDouble();
		
		System.out.println("Informe o peso em kg: ");
		double peso = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc >= 18.8 && imc <= 24.9) {
			JOptionPane.showMessageDialog(frame,
					"Imc: " + imc + ", Peso normal",
					"Exercicio 8",
					JOptionPane.QUESTION_MESSAGE);
		}
		else if (imc < 18.8) {
			JOptionPane.showMessageDialog(frame,
					"Imc: " + imc + ", Abaixo do peso",
					"Exercicio 8",
					JOptionPane.QUESTION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(frame,
					"Imc: " + imc + ", Acima do peso",
					"Exercicio 8",
					JOptionPane.QUESTION_MESSAGE);
		}
		
		
		frame.dispose();
		sc.close();
	}
}
