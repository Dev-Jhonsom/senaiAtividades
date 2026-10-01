package atividadeJavaLista;

// main - comando para criar o ambiente java de programação
// sout: usado para invocar o print

/**
 * concatenação aqui no Java é com o simbolo de " + "
 * Sempre ao fim de uma ordem/comando tenho que colocar o " ; "
 * String - sempre recebe palavras/textos entre aspas ""
 * int - é para numeros sem casa decimal.
 * Double - Varoavel com casas decimais/ponto flutuante
 * Locale.setDefault(Locale.US); - Para transformar o numero do formato brasileiro para o formato americano
 * Scanner sc (nextLint , next , close , nextInt, nextDouble)
 * javax.swing.JOption.showMenssageDialog(parentComponent: null,
 message:"Reposta Do sistema",
 title:"Question",
 javax.swing.JOptionPane.QUESTION_MESSAGE)
 */

public class Exercicio1 {
    public static void main(String[] args) {
        int y = 10;
        int z = 20;
        int b = y + z;
        String x = " Olá mundo";
        System.out.println("Hello World!"+ x );
        System.out.println(10+20);
        System.out.println(y+z);
        System.out.println(b);
    }
}
