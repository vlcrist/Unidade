import java.util.Scanner;

public class Uni03Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double vl_inicial; 
        System.err.println("Bem vindo ao sistema de loja de sapatos!");
        System.out.println("Primeiramente, insira o preço inicial dos sapatos");
        vl_inicial = sc.nextDouble();
        System.out.println("O valor do desconto é de 12% sobre o valor inicial.");
        double vl_percentual_desconto = 0.12;
        Double vl_desconto = vl_inicial * vl_percentual_desconto;
        Double vl_final = vl_inicial - vl_desconto;
        System.out.println("O valor do desconto é R$" + vl_desconto);
        System.out.println("O valor final do sapato é de R$" + vl_final);
        sc.close();
    }
}
