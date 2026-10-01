package atividadeJavaLista._1_exercicioDeIf;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class MediaPonderadaSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota !");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a segunda nota!");
        double nota2 = sc.nextDouble();

        double mpoderada = ((nota1 * 2 + nota2 * 3) / (2 + 3));

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                mpoderada,
                "Atividade 10",


                JOptionPane.QUESTION_MESSAGE);
        sc.close();
    }
}
