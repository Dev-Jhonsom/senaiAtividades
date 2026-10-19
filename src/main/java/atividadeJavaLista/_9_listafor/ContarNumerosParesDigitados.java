package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class ContarNumerosParesDigitados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        int numeP = 0;

        for (int cont = 1; cont <= 10; cont++){
            System.out.println("contagem atual = " + cont);

            System.out.println("informe um número");
            int numero = sc.nextInt();

            if (numero % 2 == 0){
                numeP++;
                System.out.println("Numeros pares atual"+numeP);
            }
        }

        System.out.println("O total de numeros pares foi: " + numeP);

        sc.close();
        frame.dispose();
    }
}


