package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MediaDeIdadesIndeterminada {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int soma = 0;
		int idadeInformada;
		int contador = 0;
		
		do {
			System.out.println("Informe a idade, ou digite 0 para cancelar");
			idadeInformada = sc.nextInt();
			
			if (idadeInformada > 0) {
				contador++;
				System.out.println("Somando sua idade ao total");
				soma += idadeInformada;
			}
			else if (idadeInformada < 0) {
				System.out.println("Idade informada inválida, informe uma idade maior que zero");
			}
			else {
				System.out.println("Interrompendo");
			}
		} while (idadeInformada != 0);
		
		
		
		JOptionPane.showMessageDialog(frame,
				"Média das idades informadas " +  (soma / contador),
				"Atividade 3",
				
				
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
	}
}
