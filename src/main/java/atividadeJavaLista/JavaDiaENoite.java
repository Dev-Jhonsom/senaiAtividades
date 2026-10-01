package atividadeJavaLista;

import java.util.Locale;
import java.util.Scanner;

public class JavaDiaENoite {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o horario ?");
        double h = sc.nextDouble();

        if (h < 12) {
            System.out.println("Bom Dia");
        } else if (h >= 12 && h < 18) {
            System.out.println("Boa Tarde");
        }
        if (h >= 18 && h <= 23){
            System.out.println("Boa Noite");
        } else {
            System.out.println("Informe um horario valido");
        }
        sc.close();
    }


}
