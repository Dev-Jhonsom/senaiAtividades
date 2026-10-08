package atividadeJavaLista.java_lista_5_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MediaDeNotas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int contador = 1;
		double somaNota = 0;
		
		while (contador <= 5){
			System.out.println("Informe a nota" + contador);
			double nota = sc.nextDouble();
			
			somaNota = somaNota + nota;
			contador ++;
		}
		
		double media = somaNota / 5 ;
		
		javax.swing.JOptionPane.showMessageDialog(frame,
				"A média aritmética das notas é: " + media ,
				"Exercicio 8",
				JOptionPane.QUESTION_MESSAGE);
		
		
		frame.dispose();
		sc.close();
	}
}
