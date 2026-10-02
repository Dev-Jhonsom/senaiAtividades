package atividadeJavaLista._3_ListaDeExercicio;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoGestaoDeCombustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a distancia!");
        double distancia = sc.nextDouble();
        System.out.println("Informe quanto faz por LITRO!");
        double consumoM = sc.nextDouble();

        double combustivelNess = (distancia/consumoM);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog( frame,

                "Você precisa de: " + combustivelNess + "L",
                "Atividade 3",

                JOptionPane.QUESTION_MESSAGE);

        sc.close();


    }
}
