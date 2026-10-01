package atividadeJavaLista._1_exercicioDeIf;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetrica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor 1 !");
        int valor1 = sc.nextInt();

        System.out.println("Informe o valor 2 !");
        int valor2 = sc.nextInt();

        System.out.println("Informe o valor 3 !");
        int valor3 = sc.nextInt();

        System.out.println("Informe o valor 4 !");
        int valor4 = sc.nextInt();

        //System.out.println((valor1 + valor2 + valor3 + valor4)/ 4 );



        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(  frame,
                "resultado é: " + ((valor1 + valor2 + valor3 + valor4)/ 4),
                "Exercicio 2" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        sc.close();
    }
}
