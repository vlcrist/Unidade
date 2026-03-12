import java.util.Scanner;

public class Uni03Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de conversão de temperaturas!");
        System.out.println("Edição graus Celsius para graus Fahrenheit");
        System.out.println("Insira a temperatura (em °C):");
        double nr_celsius = sc.nextDouble();
        double nr_fahrenheit = (nr_celsius * 9/5) + 32;
        System.out.printf("%.2f", nr_fahrenheit); 
        sc.close();
    }
}
