import java.util.Scanner;

public class Uni03Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de cálculo de velocidade média e quantidade de combustível gasta!");
        System.out.println("Primeiramente, insira a distância percorrida em km:");
        int vl_distancia = sc.nextInt();
        System.out.println("Agora, insira o tempo gasto em horas:");
        int vl_tempo = sc.nextInt();
        int vl_velocidade = vl_distancia / vl_tempo;
        double vl_combustivel = vl_distancia / 12.0;
        System.out.println("A velocidade média foi de " + vl_velocidade + " km/h e a quantidade de combustível usado foi " + vl_combustivel + " litros.");
        sc.close();
    }    
}
