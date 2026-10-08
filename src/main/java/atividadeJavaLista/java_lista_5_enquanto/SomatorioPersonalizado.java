package atividadeJavaLista.java_lista_5_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SomatorioPersonalizado {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe um numero! ");
		int limite = sc.nextInt();
		int contador = 0;
		
		while (contador <= limite){
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Soma atual: " + contador ,
					"Exercicio 7",
					JOptionPane.QUESTION_MESSAGE);
			
			contador += 1;
		}
		
		frame.dispose();
		sc.close();
	}
}
