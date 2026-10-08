package atividadeJavaLista.java_lista_5_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ContagemCrescente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1; // Inicializa a variável com o valor 1
		
		while (contador <= 50) { // A condição do ciclo é que o contador seja menor ou igual a 50
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Contagem: " + contador,
					"Exercicio 1",
					JOptionPane.QUESTION_MESSAGE);
			
			contador++; // Incrementa o valor do contador em 1
		}
			
			frame.dispose();
			sc.close();
		}
	}
