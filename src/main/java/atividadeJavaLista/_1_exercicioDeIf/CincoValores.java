package atividadeJavaLista._1_exercicioDeIf;

import java.util.Locale;
import java.util.Scanner;

public class CincoValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe o valor 1");
        int valor1 = sc.nextInt();

        System.out.println("Informe o valor 2");
        int valor2 = sc.nextInt();

        System.out.println("Informe o valor 3");
        int valor3 = sc.nextInt();

        System.out.println("Informe o valor 4");
        int valor4 = sc.nextInt();

        System.out.println("Informe o valor 5");
        int valor5 = sc.nextInt();

        double soma = valor1 + valor2 + valor3 + valor4;

        double resultado = soma / valor5;


        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(  frame,
                "resultado é: " + resultado,
                "Exercicio 1" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        sc.close();

    }
}
