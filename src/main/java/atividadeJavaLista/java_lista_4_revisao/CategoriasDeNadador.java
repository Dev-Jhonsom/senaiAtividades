package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CategoriasDeNadador {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nadador, informe a sua idade");
		int idade = sc.nextInt();
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		if (idade >= 18) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Categoria: Nadador Sênior",
					"Exercicio 4",
					JOptionPane.QUESTION_MESSAGE);
		} else if (idade >= 8) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Categoria: Nadador Juvenil",
					"Exercicio 4",
					JOptionPane.QUESTION_MESSAGE);
		} else {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Categoria: Nadador Infantil",
					"Exercicio 4",
					JOptionPane.QUESTION_MESSAGE);
		}
		
		frame.dispose();
		sc.close();
	}
}
