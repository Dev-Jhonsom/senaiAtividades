package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);


        int divisores = 0;

        System.out.println("Informe um numero para saber se ele e Primo");
        int n= sc.nextInt();

        for (int cont = 1; cont <= n;cont++) {
            if (n % cont == 0)
                divisores++;
        }
            if (divisores == 2){
                System.out.println(n + "é um numero primo.");
            }else {
                System.out.println(n + "Não é um numero primo.");
            }
        sc.close();
        frame.dispose();
    }

}


