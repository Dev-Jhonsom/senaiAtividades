package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class MediaDe5Numeros {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        double soma = 0;

        for (int cont = 1; cont <= 5; cont++) {

            System.out.print("Informe um numero: ");
            double numero = sc.nextDouble();

            soma += numero;
        }

           double media = soma/5;


        System.out.println("A média dos 5 números é: " + media);


        sc.close();
        frame.dispose();
    }
}

