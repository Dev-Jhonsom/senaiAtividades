package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class ContarNumerosMaioresQue50 {
    public  static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        int maior = 0;

        for (int cont = 1; cont <=8; cont++){
            System.out.println("Informe um numero");
            int numero = sc.nextInt();

            if (numero > 50){
                maior++;
            }
        }

        System.out.println("A quantidade de numeros MAIORES que 50 = " + maior);

        sc.close();
        frame.dispose();
    }
}