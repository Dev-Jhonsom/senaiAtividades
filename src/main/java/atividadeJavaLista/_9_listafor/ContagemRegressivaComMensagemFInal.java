package _9_listafor.java;

import java.util.Locale;
import java.util.Scanner;

public class ContagemRegressivaComMensagemFInal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setAlwaysOnTop(true);


        for (int cont = 10; cont >= 0; cont--){
            System.out.println(cont);
        }

        System.out.println("Lançamento Autorizado! ");

        sc.close();
        frame.dispose();
    }
}
