package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SignoZodiacal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		
		System.out.println("Informe seu dia de nascimento ");
		int diaN = sc.nextInt();
		System.out.println("Informe seu més de nascimento ");
		int mesN = sc.nextInt();
		
		
		if (mesN <= 4 && mesN >= 3 && diaN >= 19 && diaN <= 21){
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Signo de Áries",
					"Exercicio 15",
					JOptionPane.QUESTION_MESSAGE);
		
		
		} else {
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Outro Signo!",
					"Exercicio 15",
					JOptionPane.QUESTION_MESSAGE);
			
		}
		
		
		frame.dispose();
		sc.close();
	}
}