package atividadeJavaLista.java_lista_4_revisao;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class VogalOuConsoante {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		String vogal = ("a,e,i,o,u");
		String resultado = "";
		System.out.println("Informe uma letra qualquer");
		String letra = sc.next();
		letra = letra.toLowerCase();
		if (letra.equals("a")) {
			resultado = "vogal";
		}
		else if (letra.equals("e")) {
			resultado = "vogal";
		}
		else if (letra.equals("i")) {
			resultado = "vogal";
		}
		else if (letra.equals("o")) {
			resultado = "vogal";
		}
		else if (letra.equals("u")) {
			resultado = "vogal";
		}
		else {
			resultado = "consoante";
		}
		
		
		
		JOptionPane.showMessageDialog(frame,
				"Letra é uma: " +resultado,
				"Exercicio 9",
				JOptionPane.QUESTION_MESSAGE);
		
		frame.dispose();
		sc.close();
	}
}
