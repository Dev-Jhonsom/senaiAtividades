package _1_exemplos;

import java.util.Locale;
import java.util.Scanner;

public class Colinha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /**
         * concatenação aqui no Java é com o simbolo de " + "
         * Sempre ao fim de uma ordem/comando tenho que colocar o " ; "
         * String - sempre recebe palavras/textos entre aspas ""
         * int - é para numeros sem casa decimal.
         * Double - Varoavel com casas decimais/ponto flutuante
         * Locale.setDefault(Locale.US); - Para transformar o numero do formato brasileiro para o formato americano
         * Scanner sc (nextLint , next , close , nextInt, nextDouble)
         * System.exit(0); // <--- Finaliza o programa e encerra a EDT
         * frame.dispose(); // <--- Libera os recursos do JFrame e permite que a thread termine
         * javax.swing.JFrame frame = new javax.swing.JFrame();
         *         frame.setAlwaysOnTop(true);
         * javax.swing.JOption.showMenssageDialog(parentComponent: frame,
         >>>>não precisa escrever message:"Reposta Do sistema",
         >>>>não precisa escrever title:"Question",
         javax.swing.JOptionPane.QUESTION_MESSAGE)
         */


        sc.close();
    }
}
