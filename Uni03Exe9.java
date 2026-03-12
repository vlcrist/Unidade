import java.util.Scanner;

public class Uni03Exe9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double vl_pi = 3.14159265358979;
    System.out.println("Bem vindo ao programa de cálculo de volume de uma lata de óleo");
    System.out.println("Insira o valor do raio");
    double vl_raio = sc.nextDouble();
    System.out.println("Agora, insira o valor da altura:");
    double vl_altura = sc.nextDouble();
    double vl_volume_lata = vl_pi * Math.pow(vl_raio, 2) * vl_altura;
    String vl_volume_format = String.format("%.2f", vl_volume_lata);
    System.out.println("O volume da lata de óleo é: " + vl_volume_format);
    sc.close();
    }
}
