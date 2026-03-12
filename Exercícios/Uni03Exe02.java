/*

// __ Enunciado:

Uma loja de calçados está concedendo 12% de desconto nos produtos. 
Escreva um programa para calcular e exibir o valor de desconto a ser dado 
num par de sapatos e quanto deve custar o produto com o desconto. 
O preço do par de sapatos deve ser informado pelo usuário. 
Como resultado, o programa deverá exibir as seguintes mensagens:

O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx

//__ Análise: OK

Uma loja de calçados está concedendo Escreva um programa para


//__ Entradas:

ler (vl_inicial) ler (vl_percentual_desconto);


//__ Processos: 

vl_desconto = vl_inicial * vl_percentual_desconto;
vl_final = vl_inicial - vl_desconto;


//__ Saídas: valor do desconto e valor do produto com o desconto

imprimir (vl_desconto) imprimir (vl_final)

*/

import java.util.Scanner;

public class Uni03Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __Variáveis:
        Double vl_inicial;
        double vl_percentual_desconto = 0.12;

        System.err.println("Bem vindo ao sistema de loja de sapatos!");
        System.out.println("O valor do desconto é de 12% sobre o valor inicial.");
        // __Entradas:
        
        System.out.println("Primeiramente, insira o preço inicial dos sapatos");
        vl_inicial = sc.nextDouble();
        
        // __Processos:
        Double vl_desconto = vl_inicial * vl_percentual_desconto;
        Double vl_final = vl_inicial - vl_desconto;
        
        // __Saídas:
        System.out.println("O valor do desconto é R$" + vl_desconto);
        System.out.println("O preço do par de sapatos com desconto é de R$" + vl_final);
        sc.close();
    }
}

/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * Valor do sapato: 100
 * Desconto: 12
 * Valor final: 88
 * 
 * _ Caso 2 ___
 * Valor do sapato: 112
 * Desconto: 13.44
 * Valor final: 98.56
 */