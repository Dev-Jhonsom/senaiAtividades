package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class TabuadaDeUmNumero {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);



        System.out.println("Informe um número para saber sua tabuada ! :");
        int n = sc.nextInt();

        for (int cont = 1; cont <= 10 ; cont++){
            int resultado = n * cont;

            javax.swing.JOptionPane.showMessageDialog(frame,
                    "A tabuada de : " + n + "*" + cont + "=" +"\n" + resultado,
                    "Exercicio 8" ,
                    javax.swing.JOptionPane.QUESTION_MESSAGE);

        }
        sc.close();
        frame.dispose();
    }
}

