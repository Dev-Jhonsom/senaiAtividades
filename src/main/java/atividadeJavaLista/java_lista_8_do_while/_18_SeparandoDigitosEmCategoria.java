package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _18_SeparandoDigitosEmCategoria {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		
		do {
			System.out.println("Informe o " + contador + "º número de 10");
			int numero = sc.nextInt();
			int ultimoDigito = numero % 10;
			String resultado;
			
			if (ultimoDigito == 0) {
				resultado = "O número " + numero + " termina em 0";
			} else if (ultimoDigito == 5 || ultimoDigito == -5) {
				resultado = "O número " + numero + " termina em 5";
			} else {
				resultado = "O número " + numero + " termina em outro valor";
			}
			
			JOptionPane.showMessageDialog(frame,
					resultado,
					"Atividade 18",
					JOptionPane.QUESTION_MESSAGE);
			contador++;
		} while (contador <= 10);
		
		sc.close();
		frame.dispose();
	}
}
