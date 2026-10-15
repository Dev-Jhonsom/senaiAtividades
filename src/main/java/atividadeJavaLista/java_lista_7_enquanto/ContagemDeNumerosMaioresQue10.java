package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ContagemDeNumerosMaioresQue10 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		int numero = -1;
		int maior = 0;
		while (numero != 0){
			
			System.out.println("Informe um numero ou digite 0 para parar ");
			numero = sc.nextByte();
			
			if (numero >= 10){
				
				maior ++;
				
			}
			
		}
		
		JOptionPane.showMessageDialog(frame,
				"A quantidade de numeros MAIOR que 10 é =" + maior ,
				"Atividade 2",
				
				
				JOptionPane.QUESTION_MESSAGE);
		
		sc.close();
		frame.dispose();
	}
}
