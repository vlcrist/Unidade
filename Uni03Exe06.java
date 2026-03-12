import java.util.Scanner;

public class Uni03Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de cálculo de custo de prato no buffet!");
        System.out.println("SOMENTE R$25,00 POR KILO");
        System.err.println("Insira o valor da pesagem (em kilos): ");
        double vl_peso_kilos = sc.nextDouble();
        double vl_peso_gramas = (vl_peso_kilos * 1000) - 750;
        int vl_per_kilo = 25;
        double vl_peso_final = (vl_peso_gramas / 1000) * vl_per_kilo;
        System.err.println("O valor do prato do cliente é R$" + vl_peso_final);
        sc.close();
    }
}
