package atividadeJavaLista._1_exercicioDeIf;

import java.util.Locale;
import java.util.Scanner;

public class RestoDaDivisão {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        int valor1 = sc.nextInt();

        System.out.println("Informe o segundo valor");
        int valor2 = sc.nextInt();


        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(  frame,
                valor1 % valor2,
                "Exercicio 8" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        sc.close();
    }
}
