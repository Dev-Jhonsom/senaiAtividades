package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class FatorialSimples {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numero ;
		
		System.out.println("Informe um numero");
		numero = sc.nextInt();
		
		int soma = numero;
		int base = numero;
		
		while (numero != 1){
			System.out.println("Loop " + numero);
			
			System.out.println("Vai fazer: soma = " + soma + " * " + numero + " - 1 (" + (numero - 1) + ")" );
			soma = soma * (numero - 1) ;
			System.out.println("soma atual: " + soma);
			
			numero --;
		}
		
		JOptionPane.showMessageDialog(frame,
				"Fatorial " +  base + "!: " + soma,
				"Atividade 3",
				JOptionPane.QUESTION_MESSAGE);
		
		frame.dispose();
		sc.close();
	}
}
