import java.util.Scanner;

public class Uni03Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float vl_gasolina;
        float vl_pgto;
        double nr_litros;
        System.out.println("Cálculo da gasolina!");
        System.out.println("Primeiramente, insira o valor da gasolina (em R$)!");
        vl_gasolina = sc.nextFloat();
        System.out.println("Insira o valor do pagamento para calcular.");
        vl_pgto = sc.nextFloat();
        nr_litros = vl_pgto / vl_gasolina;
        String nr_litrosC = String.format("%.2f", nr_litros);
        System.out.println("O motorista consegui colocar: " + nr_litrosC + " litros");
        sc.close();
    }
}
