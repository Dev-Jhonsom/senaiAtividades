package _1_exemplos;

import java.util.Scanner;

public class ScannerSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String y;
        System.out.println("Entrada de dados: ");

        y = sc.nextLine();
        System.out.print("Saida de dados: " + y);
        sc.close();
    }
}
