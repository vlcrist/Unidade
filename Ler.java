import java.util.Scanner;

public class Ler {
    public static void main(String[] args) {
        // Scanner Class 
        int numero;
        Scanner leitor = new Scanner(System.in);
        System.err.println("Insira o número:");
        numero = leitor.nextInt();
        System.out.println("O número é: " + numero);
        leitor.close();
    }
}