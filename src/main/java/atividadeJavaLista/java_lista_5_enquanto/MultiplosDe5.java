package atividadeJavaLista.java_lista_5_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MultiplosDe5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe um numero Limite: ");
		int limite = sc.nextInt();
		int contador = 0;
		
		while (contador <= limite){
			
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Multiplos de 5:  " + contador,
						"Exercicio 5",
						JOptionPane.QUESTION_MESSAGE);
			
			contador += 5;
			}
		
		frame.dispose();
		sc.close();
		}
		
	}

