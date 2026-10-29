package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class MaiorNumeroDe5Valores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        int maior = 0;

        for (int cont = 1; cont <= 5; cont++){
            System.out.println("Informe um numero !");
            int numero = sc.nextInt();
           if (numero > maior){
               maior = numero;

           }

            System.out.println("O maior número digitado foi: " + maior);
        }

        sc.close();
        frame.dispose();
 }
}