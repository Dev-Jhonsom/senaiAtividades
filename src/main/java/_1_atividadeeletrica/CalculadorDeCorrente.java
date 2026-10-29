package _1_atividadeeletrica;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CalculadorDeCorrente {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		javax.swing.JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
		
		System.out.println("Informe o nome do produto ! :");
		String produto = sc.nextLine();
		
		System.out.println("Informe a potência eletrica do aparelho (W)! : ");
		double potencia = sc.nextDouble();
		
		System.out.println("Informe a tensão da rede de alimentação (120V ou 220V) : ! ");
		double tensao = sc.nextDouble();
		
		double calculo = potencia/tensao;
		
		System.out.println("Corrente = " + calculo);
		
		
		if (calculo <= 15.5 ) {
			System.out.print("bitola de 1,5 mm² !");
		} else if (calculo >= 15.5 && calculo <= 21.0) {
			System.out.print("bitola de 2,5 mm² !");
		} else if (calculo >=21.0 && calculo<=28.0) {
			System.out.print("bitola de 4,0 mm² !");
		} else if (calculo >=28.0 && calculo <=36.0) {
			System.out.print("bitola de 6,0 mm² !");
		} else if (calculo >=36.0 && calculo <=50.0) {
			System.out.print("bitola de 10,0 mm² !");
		} else if (calculo > 50.0) {
			System.out.print("bitola de 16,0 mm² ou superior !");
			
		}
		
		sc.close();
		frame.dispose();
	}
}
