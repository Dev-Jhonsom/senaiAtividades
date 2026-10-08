package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class FaixasDeImposto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		double imposto10 = 1 ;
		double imposto20 = 1 ;
		
		System.out.println("Informe o salario!:");
		double salario = sc.nextDouble();
		
		if (salario >= 2001 && salario <= 5000 ){
		 	imposto10 = (salario - (salario * 0.10));
			 
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Seu salario com desconto de 10% é : " + imposto10,
					"Exercicio 14",
					JOptionPane.QUESTION_MESSAGE);
			
		} else if (salario > 5000) {
			imposto20 = (salario - (salario * 0.20));
			
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Seu salario com desconto de 20% é : " + imposto20,
					"Exercicio 14",
					JOptionPane.QUESTION_MESSAGE);
			
		} else if (salario <= 2000) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Seu salario liquido é : " + salario,
					"Exercicio 14",
					JOptionPane.QUESTION_MESSAGE);
		}
		
		
		frame.dispose();
		sc.close();
	}
}
