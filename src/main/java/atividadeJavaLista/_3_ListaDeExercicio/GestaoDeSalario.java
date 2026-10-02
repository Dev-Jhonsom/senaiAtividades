package atividadeJavaLista._3_ListaDeExercicio;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class GestaoDeSalario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Informe o salario Bruto!");
			double salarioB = sc.nextDouble();
			
			double imposto = salarioB * 0.10;
		
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		javax.swing.JOptionPane.showMessageDialog(frame,
		     "O seu Salario Liquido é : R$" + (salarioB - imposto),
				"Exercicio 5",
				JOptionPane.QUESTION_MESSAGE);
		
		
		sc.close();
		
	}
}
