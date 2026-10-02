package atividadeJavaLista._3_ListaDeExercicio;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoGestaoEscolar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pesoP = 0.70;
        double pesoA = 0.30;

        System.out.println("Informe a nota da prova!");
        double prova = sc.nextDouble();

        System.out.println("Informe a nota das atividades!");
        double atividade = sc.nextDouble();

        double notaF = ((prova * pesoP + atividade * pesoA) / (pesoP + pesoA));
        
        
        String resultado = (notaF > 6) ? "Aprovado!" : "Reprovado!";
        
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);
        javax.swing.JOptionPane.showMessageDialog(frame,
                resultado,
                "Atividade 1",
                
                
                JOptionPane.QUESTION_MESSAGE);
        
        javax.swing.JOptionPane.showMessageDialog(frame,
                "A nota final do aluno é: " + notaF,
                "Atividade 1",


                JOptionPane.QUESTION_MESSAGE);

        sc.close();
    }
}
