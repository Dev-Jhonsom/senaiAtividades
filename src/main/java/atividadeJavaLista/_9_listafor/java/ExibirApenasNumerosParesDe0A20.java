package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class ExibirApenasNumerosParesDe0A20 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);


        for (int cont = 0; cont <= 20; cont++)
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
        sc.close();
        frame.dispose();
    }
}
