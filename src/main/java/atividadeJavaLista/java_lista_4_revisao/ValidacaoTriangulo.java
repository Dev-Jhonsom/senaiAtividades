package atividadeJavaLista.java_lista_4_revisao;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoTriangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int ladoA,ladoB,ladoC;
		
		System.out.println("Informe A !");
		ladoA = sc.nextByte();
		
		System.out.println("Informe B !");
		ladoB = sc.nextByte();
		
		System.out.println("Informe C !");
		ladoC = sc.nextByte();
		
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		if (
				ladoA < (ladoB+ladoC) &&
				ladoB < (ladoA+ladoC) &&
				ladoC < (ladoA+ladoB)
		) {
			
			javax.swing.JOptionPane.showMessageDialog(  frame,
					"Lados informados podem formar um triangulo válido",
					"Exercicio 2" ,
					javax.swing.JOptionPane.QUESTION_MESSAGE
			);
		}
		else {
			
			javax.swing.JOptionPane.showMessageDialog(  frame,
					"Lados informados são impossíveis de formar um triangulo válido",
					"Exercicio 2" ,
					javax.swing.JOptionPane.QUESTION_MESSAGE
			);
		}
		frame.dispose();
		sc.close();
	}
}
