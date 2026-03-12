/*

__ Enunciado:
Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as
dimensões de um terreno e depois exibir a área do terreno.

__ Análise: OK

Uma imobiliária vende apenas Faça um programa para 

//__ Entradas: 

ler(largura) ler(comprimento)

//__ Processos: 

area = largura x comprimento

//__ Saídas: // área do terreno

imprimir(area)

*/



import java.util.Scanner;

public class Uni03Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao cálculo de área de terrenos retangulares!");
        //__ Variáveis:
        Float nr_base;
        Float nr_altura;


        //__ Entradas
        System.out.println("Primeiramente, insira o valor da base:");
        nr_base = sc.nextFloat();
        
        System.out.println("Agora, insira o valor da altura:");
        nr_altura = sc.nextFloat();
        
        //__ Processos:
        Float nr_area = nr_base * nr_altura;
        
        //__ Saídas:
        System.out.println("O valor da área é: " + nr_area);
        sc.close();
    }
}


/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * largura: 2
 * comprimento: 3
 * area: 6
 * 
 * _ Caso 2 ___
 * largura: 3.7
 * comprimento: 2.4
 * area: 8.88
 */