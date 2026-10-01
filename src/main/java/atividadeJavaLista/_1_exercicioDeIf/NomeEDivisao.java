package atividadeJavaLista._1_exercicioDeIf;

import java.util.Locale;
import java.util.Scanner;

public class NomeEDivisao {
    public static void main(String[] args) {
        String nome;
        double valor1,valor2;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        nome = sc.nextLine();

        System.out.print("Informe o valor 1: ");
        valor1 = sc.nextDouble();

        System.out.print("Informe o valor 2: ");
        valor2 = sc.nextDouble();

        //System.out.println("Seu nome é: " + nome);
        //System.out.println("A divisão entre " + valor1 + " e " + valor2 + " é: " + (valor1 / valor2));


        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);

        javax.swing.JOptionPane.showMessageDialog(  frame,
                "Seu nome é: " + nome + "\n" + "A divisão entre " + valor1 + " e " + valor2 + " é: " + (valor1 / valor2),
                "Exercicio 4" ,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        sc.close();
    }
}
