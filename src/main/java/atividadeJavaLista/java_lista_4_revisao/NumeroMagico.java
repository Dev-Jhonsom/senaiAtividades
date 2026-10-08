package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class NumeroMagico {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe um número entre 1000 e 9999");
		int numeroCompleto = sc.nextInt();
		
		
		
		int primeirosDois = numeroCompleto / 100;
		int ultimosDois = numeroCompleto % 100;
		
		int soma = primeirosDois + ultimosDois;
		int somaAoQuadrado = soma * soma;
		
		if (somaAoQuadrado == numeroCompleto) {
			JOptionPane.showMessageDialog(
					frame,
					"Esse número possui uma caracteristica especifica",
					"Exercicio 13",
					JOptionPane.QUESTION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(
					frame,
					"Esse número não possui uma caracteristica especifica",
					"Exercicio 13",
					JOptionPane.QUESTION_MESSAGE);
		}
		
		
		
		
		
		
		frame.dispose();
		sc.close();
	}
}
