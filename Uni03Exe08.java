import java.util.Scanner;

public class Uni03Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de câmbio de dólares para reais");
        System.out.println("O valor do dólar na cotação é de 5.65");
        System.out.println("Insira a quantidade dólares:");
        double vl_dolar = sc.nextDouble();
        double vl_cotacao = 5.65;
        double vl_reais = vl_dolar * vl_cotacao;
        System.out.println("O atendente deve devolver R$" + vl_reais + " para o cliente");
        sc.close();
    }
}
