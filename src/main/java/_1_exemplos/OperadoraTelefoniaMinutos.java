package _1_exemplos;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class OperadoraTelefoniaMinutos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valorAPagar = 50;
        int minutos = 0;
        int resultado = 0;
        System.out.println("Informe os minutos !");
        minutos = sc.nextInt();
        int tempoExcedente = minutos - 100;
        int valorAMais = 0;
        
        
        if (tempoExcedente > 0) {
            valorAMais = tempoExcedente * 2;
        }
        
        resultado = valorAPagar + valorAMais;
        
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "Valor a pagar: R$" + resultado + ",00",
                "Problema exemplo",
                JOptionPane.QUESTION_MESSAGE
        );
        
        sc.close();
    }
}
