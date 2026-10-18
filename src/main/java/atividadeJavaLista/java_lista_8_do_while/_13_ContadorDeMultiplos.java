package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _13_ContadorDeMultiplos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		int multiplos = 0;
		
		do {
			System.out.println("Informe o " + contador + "º número de 15");
			int numero = sc.nextInt();
			
			if (numero % 4 == 0) {
				multiplos++;
			}
			contador++;
		} while (contador <= 15);
		
		JOptionPane.showMessageDialog(frame,
				"Total de múltiplos de 4: " + multiplos,
				"Atividade 13",
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
	}
}
