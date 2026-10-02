package atividadeJavaLista._3_ListaDeExercicio;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class GestaoDePontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int jogador1;
        int jogador2;
        int multiplicadorJogador1 = 10;
        int multiplicadorJogador2 = 5;

        System.out.print("Informe a quantidade de vitórias do jogador 1:");
        jogador1 = sc.nextInt();

        System.out.print("Informe a quantidade de vitórias do jogador 2:");
        jogador2 = sc.nextInt();

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                "pontuação do jogador 1: " + (jogador1 * multiplicadorJogador1) ,
                "Atividade 4",
                JOptionPane.QUESTION_MESSAGE);
        
        javax.swing.JOptionPane.showMessageDialog(frame,
                "pontuação do jogador 2: " + (jogador2 * multiplicadorJogador2) ,
                "Atividade 4",
                JOptionPane.QUESTION_MESSAGE);

        sc.close();
    }
}
