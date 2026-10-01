package atividadeJavaLista._1_exercicioDeIf;

import java.util.Locale;
import java.util.Scanner;

public class SucessorAntecessor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor");
        int valor1 = sc.nextInt();

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(  frame,
                "Antecessor: " + (valor1 - 1) + "\nSucessor: " + (valor1 + 1),
                "Exercicio 7" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );
    }
}
