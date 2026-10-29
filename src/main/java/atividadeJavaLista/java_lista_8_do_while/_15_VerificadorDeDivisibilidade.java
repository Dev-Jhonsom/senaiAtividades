package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _15_VerificadorDeDivisibilidade {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		char resposta;
		
		do {
			System.out.println("Informe o número N");
			int numero = sc.nextInt();
			System.out.println("Informe o divisor D");
			int divisor = sc.nextInt();
			String resultado;
			
			if (divisor == 0) {
				resultado = "Não é possível dividir por zero";
			} else if (numero % divisor == 0) {
				resultado = numero + " é divisível por " + divisor;
			} else {
				resultado = numero + " não é divisível por " + divisor;
			}
			
			JOptionPane.showMessageDialog(frame,
					resultado,
					"Atividade 15",
					JOptionPane.QUESTION_MESSAGE);
			
			System.out.println("Deseja continuar? (s/n)");
			resposta = sc.next().charAt(0);
		} while (resposta == 's' || resposta == 'S');
		
		sc.close();
		frame.dispose();
	}
}
