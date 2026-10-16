package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class SomarApenasNumerosPositivos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);


        int somaP = 0;

        for (int cont = 1; cont <= 6; cont++){
            System.out.println("Informe um numero: ");
            int numero = sc.nextInt();
            if (numero > 0){
                somaP += numero;
            }
        }

        System.out.println("A soma dos numeros Positivos e :" + somaP);






        sc.close();
        frame.dispose();
        }
    }