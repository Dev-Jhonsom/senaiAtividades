package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ContadorComCondicaoDupla {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		double numero = -1;
		
		int contM = 0;
		
		int contN = 0;
		
		int cont = 10;
		while (cont != 0 ) {
			System.out.print("Informe um numero: ");
			cont--;
			
			numero = sc.nextDouble();
			if (numero < 20) {
				
				contN++;
				
			} else if (numero > 50) {
				contM++;
			}
			
			
		
			}
		JOptionPane.showMessageDialog(frame,
				"Quantidade de Numeros Menor que 20  : " + contN + "\n" +
						"Quantidade de Numero maior que 50 : " + contM,
				"Exercicio 18",
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
		}
		
	}
