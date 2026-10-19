package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class SomaDe1Ate10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        int soma = 0;

        for (int cont = 1; cont <= 10 ; cont++){
            soma += cont ;
        }

        System.out.println("A soma é : " + soma);


        sc.close();
        frame.dispose();
    }
}
