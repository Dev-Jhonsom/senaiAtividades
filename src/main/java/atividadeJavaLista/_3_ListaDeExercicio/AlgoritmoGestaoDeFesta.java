package atividadeJavaLista._3_ListaDeExercicio;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;

public class AlgoritmoGestaoDeFesta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String dataInformada = "";
        System.out.println("Informe sua data de nascimento no formato dd/MM/yyyy");
        dataInformada = sc.nextLine();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConvertida = LocalDate.parse(dataInformada, formatador);

        LocalDate hoje = LocalDate.now();
        long anosObtidos = ChronoUnit.YEARS.between(dataConvertida, hoje);

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        if (anosObtidos >= 18) {
            javax.swing.JOptionPane.showMessageDialog(frame,
                "Você pode entrar na festa",
                    "Atividade 2",
                    JOptionPane.QUESTION_MESSAGE
            );
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "Você NÃO pode entrar na festa",
                    "Atividade 2",
                    JOptionPane.QUESTION_MESSAGE
            );
        }


        sc.close();
    }
}
