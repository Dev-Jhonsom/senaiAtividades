package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeSenha {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		int tentativa = -1 ;
		
		while (tentativa != 1234) {
			
			System.out.println("Informe a senha ! :");
			tentativa = sc.nextInt();
			
			if (tentativa == 1234) {
				
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Senha Correta ! :",
						"Atividade 15",
						
						
						JOptionPane.QUESTION_MESSAGE);
				
			} else {
				
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Senha invalida tente novamente! ",
						"Atividade 15",
						
						
						JOptionPane.QUESTION_MESSAGE);
				
			}
			
		}
		
		frame.dispose();
		sc.close();
	}
}
