package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;

public class _17_SomaDosMultiplosDe3E5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numero = 1;
		int soma = 0;
		
		do {
			if (numero % 3 == 0 || numero % 5 == 0) {
				soma += numero;
			}
			numero++;
		} while (numero <= 100);
		
		JOptionPane.showMessageDialog(frame,
				"Soma dos múltiplos de 3 ou de 5 de 1 até 100: " + soma,
				"Atividade 17",
				JOptionPane.QUESTION_MESSAGE);
		
		frame.dispose();
	}
}
