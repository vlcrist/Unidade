import java.util.Scanner;

public class Uni03Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de calculo de médias!!");
        System.out.println("Por gentileza, insira a primeira nota:");
        float vl_nt1 = sc.nextFloat();
        System.out.println("Por gentileza, insira a segunda nota:");
        float vl_nt2 = sc.nextFloat();
        System.out.println("Por gentileza, insira a terceira nota:");
        float vl_nt3 = sc.nextFloat();
        double vl_media_ponderada = ((vl_nt1 * 0.5) + (vl_nt2 * 0.3) + (vl_nt3 * 0.2));
        String vl_media_formatada = String.format("%.2f", vl_media_ponderada);
        System.err.println("A média do aluno é " + vl_media_formatada + " pontos");
        sc.close();
    }
}
