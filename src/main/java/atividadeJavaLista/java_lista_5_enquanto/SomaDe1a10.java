package atividadeJavaLista.java_lista_5_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SomaDe1a10 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		int soma = 0;
		
		while (contador <= 10) {
			 soma = soma + contador;
				
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Soma atual: " + soma ,
						"Exercicio 6",
						JOptionPane.QUESTION_MESSAGE);
			contador ++;
			}
		
		frame.dispose();
		sc.close();
		}
	}
