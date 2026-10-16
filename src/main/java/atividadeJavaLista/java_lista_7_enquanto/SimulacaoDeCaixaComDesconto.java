package atividadeJavaLista.java_lista_7_enquanto;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SimulacaoDeCaixaComDesconto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		javax.swing.JFrame frame = new javax.swing.JFrame();
		frame.setAlwaysOnTop(true);
		
		double total = 0;
		double vcompra = -1 ;
		while (vcompra != 0) {
			System.out.println("Informe o preço da próxima mercadoria, ou digite 0 para parar");
			double valor = sc.nextDouble();
			total += valor;
			
		 
			
			if (valor == 0) {
				
				vcompra ++;
				javax.swing.    JOptionPane.showMessageDialog(frame,
						"Compra finalizada, total: R$"+ total + "\n" +
						"Total com desconto: " + (total - (total * 0.10 )),
						"Atividade 20",
						
						JOptionPane.QUESTION_MESSAGE);
				frame.dispose();
				sc.close();
				System.exit(0);
				
			}
		}
	}
}

