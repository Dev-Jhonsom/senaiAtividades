package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CrescimentoPopulacional {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		
		
		double cidadeA = 1000;
		double cidadeB = 1500;
		double ano = 2026;
		
		
		while (cidadeA < cidadeB) {
			double resultadoA = cidadeA;
			cidadeA *= 0.02;
			System.out.println("cidadeA vai aumentar em " + cidadeA);
			resultadoA += cidadeA;
			System.out.println("Valor cidadeA aumentada: " + resultadoA);
			cidadeA = resultadoA;
			
			double resultadoB;
			resultadoB = cidadeB;
			
			System.out.println("cidadeB vai aumentar em " + cidadeB);
			cidadeB *= 0.01;
			resultadoB += cidadeB;
			System.out.println("Valor cidadeB aumentada: " + resultadoB);
			cidadeB = resultadoB;
			
			ano++;
		}
		
		
		JOptionPane.showMessageDialog(frame,
				"Foram necessarios  " + ano,
				"Atividade 18",
				JOptionPane.QUESTION_MESSAGE);
		
		
		frame.dispose();
		
		sc.close();
	}
}
