package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SomaDeNumerosAteLimiteInformado {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		
		System.out.println("Informe um Limite: ");
		int limite = sc.nextInt();
		
		
		int soma = 0;
		
		while (soma <= limite){
			
			System.out.println("informe um numero para soma");
			int numero = sc.nextInt();
			
			soma = soma + numero ;
			
		}
		
		JOptionPane.showMessageDialog(frame,
				"Soma total " + soma ,
				"Atividade 1",
				
				
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
	}
}
