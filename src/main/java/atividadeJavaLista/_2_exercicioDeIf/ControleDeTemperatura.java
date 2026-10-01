package atividadeJavaLista._2_exercicioDeIf;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ControleDeTemperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura !");
        double temperatura = sc.nextDouble();
        String texto;

        if (temperatura <= 18) {
            texto = "Ligar o aquecedor";
        } else if (temperatura > 18 && temperatura <= 25) {
            texto = "Manter a temperatura atual";

        } else {
            texto = "Ligar o ar condicionado";

        }

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                texto,
                "Atividade 2",


                JOptionPane.QUESTION_MESSAGE);

        sc.close();
    }
}
