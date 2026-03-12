import java.util.Scanner;

public class Uni03Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao sistema de cálculo da hipotenusa em triângulos retângulos");
        System.out.println("Insira o valor do cateto oposto:");
        double vl_co = sc.nextDouble();
        System.out.println("Insira o valor do cateto adjacente:");
        double vl_ca = sc.nextDouble();
        double vl_h = Math.sqrt(Math.pow(vl_ca,2) + Math.pow(vl_co, 2));
        System.out.printf("A hipotenusa é: %.2f", vl_h);
        sc.close();
    }
}
