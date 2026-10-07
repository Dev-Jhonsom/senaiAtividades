package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MaiorDeTres {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int a;
		int b;
		int c;
		int maior;
		
		
		System.out.println("Informe A !");
		a = sc.nextByte();
		
		System.out.println("Informe B !");
		b = sc.nextByte();
		
		System.out.println("Informe C !");
		c = sc.nextByte();
		
		if (a>b) {
			maior = a;
		}	else if (b>c) {
			maior = b;
		}	else {
			maior = c;
		}
		
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		javax.swing.JOptionPane.showMessageDialog(frame,
				"Maior: " + maior ,
				"atividade 1",
				JOptionPane.QUESTION_MESSAGE);
		
		
		sc.close();
		frame.dispose();
		}
		
	}
