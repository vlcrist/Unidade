import java.util.Scanner;

public class Uni03Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de troco!");
        System.out.println("Notas disponíveis: \n--- 100 reais \n--- 10 reais \n--- 1 real");
        System.out.println("Insira o valor da compra:");
        int vl_compra = sc.nextInt();
        System.out.println("Insira o valor recebido:");
        int vl_recebido = sc.nextInt();
        int vl_troco = vl_recebido - vl_compra;
        int nr_notas_100 = vl_troco / 100;
        int nr_notas_10 = (vl_troco % 100) / 10;
        int nr_notas_1 = vl_troco % 10;
        int nr_notas_total = nr_notas_100 + nr_notas_10 + nr_notas_1;
        System.out.println("O número mínimo de notas de troco é: " + nr_notas_total);
        System.out.println("Quantida de notas de 100 necessárias: \n--- " + nr_notas_100 + "\nQuantidade de notas de 10 necessárias: \n--- " + nr_notas_10 + "\nQuantidade de notas de 1 necessárias: \n--- " + nr_notas_1 );
        sc.close();
    }
}
