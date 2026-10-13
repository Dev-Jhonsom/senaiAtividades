package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ContagemDeNegativos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		int qtdeNegativos = 0;
		
		while (contador <= 10) {
			
			System.out.println("Informe um "+contador+"º número qualquer ! :");
			int numero = sc.nextInt();
			
			if (numero < 0) {
				qtdeNegativos++;
			}
			contador++;
			
		}
		
		if (qtdeNegativos > 0) {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Foram informados " + qtdeNegativos + " números negativos",
					"Atividade 3",
					
					
					JOptionPane.QUESTION_MESSAGE);
		} else {
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Nenhum número negativo informado!",
					"Atividade 3",
					
					
					JOptionPane.QUESTION_MESSAGE);
		}
		
		
		
		frame.dispose();
		sc.close();
	}
}
