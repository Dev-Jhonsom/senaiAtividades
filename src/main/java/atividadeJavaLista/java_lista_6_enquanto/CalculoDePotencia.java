package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CalculoDePotencia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = -1;
		double base = 0;
		double expoente = 0 ;
		double resultado = Math.pow(base,expoente);
		
		while (contador != expoente){
			
			System.out.println("Informe um numero para base");
			base = sc.nextInt();
			
			System.out.println("Informe um expoente");
			expoente = sc.nextInt();
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Potência" + base + expoente + "=" + resultado,
					"Atividade 3",
					
					
					JOptionPane.QUESTION_MESSAGE);
		
			
			
		}
		
	}
}