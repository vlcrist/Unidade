import java.util.Scanner;

public class Uni03Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de cálculo de gasto em azulejos!!");
        System.out.println("O valor da azulejo é de R$ 12,50 e vão 9 azulejos por metro quadrado");
        double vl_azulejo = 12.50;
        int nr_azulejos_por_metro = 9;
        System.out.println("Insira a altura da parede:");
        int vl_altura = sc.nextInt();
        System.out.println("Agora insira o valor do comprimento da parede:");
        int vl_comprimento = sc.nextInt();
        double vl_area = vl_altura * vl_comprimento;
        double vl_gasto = vl_area * nr_azulejos_por_metro * vl_azulejo;
        System.out.println("O gasto final é de R$" + vl_gasto);
        sc.close();

    }
}
