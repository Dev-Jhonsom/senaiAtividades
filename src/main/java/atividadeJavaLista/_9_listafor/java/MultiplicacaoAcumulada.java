package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class MultiplicacaoAcumulada {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);


            System.out.println("Informe um número para saber seu fatorial ! :");
            int n = sc.nextInt();

            int fatorial = 1;

            for (int cont = 1; cont <= n ; cont++){
                fatorial *= cont;


                System.out.println("Fatorial de " + n + " = " + fatorial);
            }

            sc.close();
            frame.dispose();
        }
    }

