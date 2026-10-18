package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _16_NumerosPrimos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe um número");
		int numero = sc.nextInt();
		int divisor = 2;
		boolean primo = numero > 1;
		
		if (numero > 2) {
			do {
				if (numero % divisor == 0) {
					primo = false;
				}
				divisor++;
			} while (divisor <= numero / divisor && primo);
		}
		
		String resultado;
		if (primo) {
			resultado = "O número " + numero + " é primo";
		} else {
			resultado = "O número " + numero + " não é primo";
		}
		
		JOptionPane.showMessageDialog(frame,
				resultado,
				"Atividade 16",
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
	}
}
