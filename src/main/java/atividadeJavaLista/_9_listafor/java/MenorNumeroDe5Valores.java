package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class MenorNumeroDe5Valores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        int menor = 999*5;

        for (int cont = 1 ; cont <= 5; cont++){
            System.out.println("Informe um numero !");
            int numero = sc.nextInt();
            if (numero < menor){
                menor = numero;

            }

            System.out.println("O menor número digitado foi: " + menor);
        }

        sc.close();
        frame.dispose();
    }
}

