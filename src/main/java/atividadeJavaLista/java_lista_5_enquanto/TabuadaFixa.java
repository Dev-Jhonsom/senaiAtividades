package atividadeJavaLista.java_lista_5_enquanto;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class TabuadaFixa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		Frame frame = new Frame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		
		while (contador <= 10) {
			
			
			JOptionPane.showMessageDialog(
				frame,
				"7 * " + contador + " = " + ( 7 * contador),
				"Exercicio 10",
				JOptionPane.QUESTION_MESSAGE);
			
			contador++;
		}
		
		
		
		frame.dispose();
		sc.close();
	}
}
