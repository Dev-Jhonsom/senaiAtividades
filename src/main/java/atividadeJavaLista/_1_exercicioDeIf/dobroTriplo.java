package atividadeJavaLista._1_exercicioDeIf;

import java.util.Locale;
import java.util.Scanner;

public class dobroTriplo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor");
        int valor1 = sc.nextInt();

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(  frame,
                "Dobro: " + (valor1 * 2) + "\nTriplo: " + (valor1 * 3),
                "Exercicio 7" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );
    }
}
