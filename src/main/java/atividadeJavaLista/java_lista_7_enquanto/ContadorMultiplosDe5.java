package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ContadorMultiplosDe5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numero = -1;
		int soma = 0;
		int resultado = 0 ;
		while (numero != 0) {
			
			System.out.println("Informe um numero! ");
			numero = sc.nextByte();
			
			if (numero % 5 == 0) {
				resultado = numero ;
				soma = soma + resultado;
				
			}
			
			JOptionPane.showMessageDialog(frame,
					"A soma dos numeros que sao multiplos de 5 e = " + soma,
					"Atividade 8",
					
					
					JOptionPane.QUESTION_MESSAGE);
			
		}
		
		sc.close();
		frame.dispose();
	}
}
