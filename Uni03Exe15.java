import java.util.Scanner;

public class Uni03Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de leitura de inteiros!");
        System.out.println("Insira um número inteiro de até 3 dígitos:");
        int nr_inteiro = sc.nextInt();
        int nr_centenas = nr_inteiro / 100;
        int nr_dezenas = (nr_inteiro % 100) / 10;
        int nr_unidades = nr_inteiro % 10;
        System.out.println(nr_centenas + " centena(s) " + nr_dezenas + " dezena(s) " + nr_unidades + " unidade(s)");
        sc.close();
    }
}
