package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class ContarDe0Ate100De5Em5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);


        for (int cont = 0; cont <= 100 ; cont+=5)

            System.out.println(cont);


        sc.close();
        frame.dispose();
    }
}




