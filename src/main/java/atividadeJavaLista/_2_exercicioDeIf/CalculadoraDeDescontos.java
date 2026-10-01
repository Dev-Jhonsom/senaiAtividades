package atividadeJavaLista._2_exercicioDeIf;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeDescontos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da compra !");
        double valorC = sc.nextDouble();

        double desconto = 0;
        int porcentagem = 0;
        double resultado;

        if (valorC == 200) {
            //resultado = valorC * 0.05;
            //resultado = valorC * 0.95;
            resultado = valorC - (valorC * 0.05);
        } else if (valorC > 200 && valorC <= 500) {
            resultado = valorC - (valorC * 0.10);

        } else {
            resultado = valorC - (valorC * 0.15);

        }

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "O valor da compra com deconto é: " + resultado,
                "Atividade 1",


                JOptionPane.QUESTION_MESSAGE);

        sc.close();
    }

}


