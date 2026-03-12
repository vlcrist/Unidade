import java.util.Scanner;

public class Uni03Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de orçamento de gasto da granja!");
        System.out.println("Insira o número de frangos para prosseguir com o programa");
        int nr_galinacios = sc.nextInt();
        
        double vl_chip = 4.0;
        double vl_alimento = 3.5 * 2; // "* 2" por que são dois por frango

        /* Poderia ter apenas somado tudo fora do java, 
        fazendo com que o "vl_per_galinea" fosse fixo e 
        sem cálculos intermediários, mas prefiro separar para
        compreender e identificar melhor */

        double vl_per_galinea = vl_chip + vl_alimento;
        double vl_orcamento = nr_galinacios * vl_per_galinea;
        String vl_orcamento_format = String.format("R$" + vl_orcamento);
        System.out.println("O gasto total para marcar " + nr_galinacios + " é " + vl_orcamento_format);
        sc.close();
    }
}
