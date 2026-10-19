package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _12_MultiplosDe3E5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe o número limite");
		int limite = sc.nextInt();
		int numero = 1;
		String resultado = "";
		
		if (limite >= 1) {
			do {
				if (numero % 3 == 0 && numero % 5 == 0) {
					resultado += numero + "\n";
				}
				numero++;
			} while (numero <= limite);
		}
		
		if (limite < 15) {
			resultado = "Nenhum múltiplo de 3 e 5 nesse intervalo";
		}
		
		JOptionPane.showMessageDialog(frame,
				resultado,
				"Atividade 12",
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
	}
}
