package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class ContarDe0AteN {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);


        System.out.println("Informe um Numero limite ! :");
        int n = sc.nextInt();

        for (int cont = 0; cont <= n ; cont++) {

            System.out.println(cont);

        }
        sc.close();
        frame.dispose();
    }
}
