package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class ContarDe10A1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);


        for (int cont = 10; cont >= 1; cont--)
            System.out.println(cont);


        sc.close();
        frame.dispose();
    }
}

