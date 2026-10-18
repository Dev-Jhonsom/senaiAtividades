package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaDeFibonacciSimplificada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        int a = 0;
        int b = 1;

        System.out.println("Os primeiros 10 números da Sequência de Fibonacci:");

        for (int cont = 1; cont <= 10;cont++){
            System.out.print(a + "" );

            int proximoN = a + b;

            a= b;
            b=proximoN;
        }



        sc.close();
        frame.dispose();
    }
}
