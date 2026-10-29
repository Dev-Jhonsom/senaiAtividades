package atividadeJavaLista.java_lista_8_do_while;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class _14_SeparandoParesEmGrupos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		int pares = 0;
		int impares = 0;
		
		do {
			System.out.println("Informe o " + contador + "º número de 12");
			int numero = sc.nextInt();
			
			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			contador++;
		} while (contador <= 12);
		
		JOptionPane.showMessageDialog(frame,
				"Total de pares: " + pares + "\n" +
				"Total de ímpares: " + impares,
				"Atividade 14",
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
	}
}
