import java.util.Scanner;

public class Uni03Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de orçamento de livros de refrigerante!");
        System.out.println("Dísponivel em 3 quantidades: \n350ml\n600ml\n2L");
        System.out.println("Primeiro insira a quantidade de refrigerantes de 350ml:");
    
        double nr_350ml = sc.nextDouble();
        System.out.println("Agora insira a quantidade de refrigerantes de 600ml:");

        double nr_600ml = sc.nextDouble();
        System.out.println("Por fim, insira a quantidade de refrigerantes de 2L:");
        
        double nr_2l = sc.nextDouble();
        double vl_litros_totais = ((nr_350ml * 350) / 1000) + ((nr_600ml * 600)/ 1000) + nr_2l * 2;
        System.out.println("O cliente comprou ao total " + vl_litros_totais + " litros");
        sc.close();
    }
}
