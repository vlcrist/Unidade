/*

// __ Enunciado:

Faça um programa para ler três notas de um 
aluno em uma disciplina e imprimira sua média ponderada 
(as notas tem pesos respectivos de 5, 3 e 2).


// __ Análise: OK

Faça um programa para de um aluno em uma disciplina



// __ Entradas:

ler (vl_nt1) ler (vl_nt2) ler(vl_nt3)


// __ Processos:

vl_media_ponderada = ((vl_nt1 * 0.5) + (vl_nt2 * 0.3) + (vl_nt3 * 0.2))


// __ Saídas:

imprimir (vl_media_ponderada)


*/
import java.util.Scanner;

public class Uni03Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de calculo de médias!!");

        // __ Variáveis e entradas (--> Prefiro definir a variável seguido do seu valor)
        System.out.println("Por gentileza, insira a primeira nota:");
        float vl_nt1 = sc.nextFloat();
        
        System.out.println("Por gentileza, insira a segunda nota:");
        float vl_nt2 = sc.nextFloat();
        
        System.out.println("Por gentileza, insira a terceira nota:");
        float vl_nt3 = sc.nextFloat();
        
        
        // __ Processos
        double vl_media_ponderada = ((vl_nt1 * 0.5) + (vl_nt2 * 0.3) + (vl_nt3 * 0.2));
        String vl_media_formatada = String.format("%.2f", vl_media_ponderada);
        
        // __ Saídas
        System.err.println("A média do aluno é " + vl_media_formatada + " pontos");
        sc.close();
    }
}
/*
Valores de teste
__ Caso 1 __
Valor nota 1: 10.0
Valor nota 2: 9.0
Valor nota 3: 10.0
Valor da média: 9.70

__ Caso 2 __
Valor nota 1: 2.0
Valor nota 2: 9.0
Valor nota 3: 8.0
Valor da média: 5.30
*/