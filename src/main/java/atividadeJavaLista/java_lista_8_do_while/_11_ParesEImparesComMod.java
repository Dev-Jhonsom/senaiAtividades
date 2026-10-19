package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _11_ParesEImparesComMod {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		
		do {
			System.out.println("Informe o " + contador + "º número de 20");
			int numero = sc.nextInt();
			String resultado;
			
			if (numero % 2 == 0) {
				resultado = "O número " + numero + " é par";
			} else {
				resultado = "O número " + numero + " é ímpar";
			}
			
			JOptionPane.showMessageDialog(frame,
					resultado,
					"Atividade 11",
					JOptionPane.QUESTION_MESSAGE);
			contador++;
		} while (contador <= 20);
		
		sc.close();
		frame.dispose();
	}
}
