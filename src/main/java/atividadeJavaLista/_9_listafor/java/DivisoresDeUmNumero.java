package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class DivisoresDeUmNumero {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);



        System.out.println("Informe um número para saber todos seus divisores ! :");
        int n = sc.nextInt();

        for (int cont = 1; cont <= n;cont++){
            if (n % cont == 0){
                System.out.print(cont);
            }
        }

        sc.close();
        frame.dispose();
    }
}
