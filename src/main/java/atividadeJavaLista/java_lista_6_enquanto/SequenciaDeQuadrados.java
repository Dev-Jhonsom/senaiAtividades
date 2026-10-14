package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SequenciaDeQuadrados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		
		int contador = 1;
		String resultado = "";
		
		while (contador <= 15) {
			resultado += "O número " + contador + " elevado a 2 é: " + (contador * contador)+"\n";
			contador++;
		}
		
		
		JOptionPane.showMessageDialog(frame,
				resultado,
				"Atividade 3",
				
				
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
	}
}
