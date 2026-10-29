package _9_listafor.java;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class SimuladorDeNotasDaTurma {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        int nota = 0;
        int aprovados = 0;
        int reprovados = 0;

        for (int cont = 1; cont <= 10;cont++){
            System.out.println("Informe a nota !");
            nota = sc.nextInt();
            if (nota >= 7 ){
                aprovados++;
            } else {
                reprovados++;

            }
        }

        JOptionPane.showMessageDialog(frame,
                "A quantidade de aprovados é: " + aprovados + "\n"
                        + "A quantidade de reprovados é: " + reprovados,
                "Atividade 20",

                JOptionPane.QUESTION_MESSAGE);

        sc.close();
        frame.dispose();
    }
}