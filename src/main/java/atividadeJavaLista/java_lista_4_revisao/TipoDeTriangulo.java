package atividadeJavaLista.java_lista_4_revisao;

import java.util.Locale;
import java.util.Scanner;

public class TipoDeTriangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int ladoA, ladoB, ladoC;
		
		System.out.println("Informe A !");
		ladoA = sc.nextByte();
		
		System.out.println("Informe B !");
		ladoB = sc.nextByte();
		
		System.out.println("Informe C !");
		ladoC = sc.nextByte();
		
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		if (
				ladoA < (ladoB + ladoC) &&
						ladoB < (ladoA + ladoC) &&
						ladoC < (ladoA + ladoB)
		) {
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Lados informados podem formar um triangulo válido",
					"Exercicio 3",
					javax.swing.JOptionPane.QUESTION_MESSAGE
			);
			boolean ehEquilatero = ladoA == ladoB && ladoB == ladoC;
			boolean ehIsoceles =
					(ladoA == ladoB && ladoB != ladoC) ||
							(ladoB == ladoC && ladoC != ladoA) ||
							(ladoC == ladoA && ladoA != ladoB);
			boolean ehEscaleno = (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA);
			
			if (ehEquilatero) {
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Triângulo é equilátero",
						"Exercicio 3",
						javax.swing.JOptionPane.QUESTION_MESSAGE
				);
			}
			else if (ehIsoceles) {
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Triângulo é isósceles",
						"Exercicio 3",
						javax.swing.JOptionPane.QUESTION_MESSAGE
				);
			}
			else {
				javax.swing.JOptionPane.showMessageDialog(frame,
						"Triângulo é escaleno",
						"Exercicio 3",
						javax.swing.JOptionPane.QUESTION_MESSAGE
				);
			}
		} else {
			
			javax.swing.JOptionPane.showMessageDialog(frame,
					"Lados informados são impossíveis de formar um triangulo válido",
					"Exercicio 3",
					javax.swing.JOptionPane.QUESTION_MESSAGE
			);
		}
		frame.dispose();
		sc.close();
	}
}
