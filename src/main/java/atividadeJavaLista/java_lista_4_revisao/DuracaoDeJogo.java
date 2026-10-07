package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class DuracaoDeJogo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		int resultado;
		System.out.println("Informe hora de inicio");
		int horaInicio = sc.nextInt();
		System.out.println("Informe hora de fim do jogo");
		int horaFim = sc.nextInt();
		
		if (horaInicio < horaFim) {
			resultado = horaFim - horaInicio;
		}
		else {
			resultado = 24 - (horaInicio - horaFim );
		}
		
		JOptionPane.showMessageDialog(frame,
				"Duração do jogo: " +resultado+" horas",
				"Exercicio 10",
				JOptionPane.QUESTION_MESSAGE);
		
		frame.dispose();
		sc.close();
	}
}
