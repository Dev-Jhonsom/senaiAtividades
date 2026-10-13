package atividadeJavaLista.java_lista_6_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class EnquantoNaoForZero {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
	 
		int tentativa = -1;
		
		while (tentativa != 0 ){
			System.out.println("Informe um numero !");
			tentativa = sc.nextInt();
			
		}
		frame.dispose();
		sc.close();
	}
}