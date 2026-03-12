/*

// __ Enunciado:

Faça um programa que leia um número inteiro de até três dígitos e 
mostre quantas centenas, dezenas e unidades ele possui.

// __ Análise : OK

faça um programa
mostre

// __ Entradas

ler (nr_inteiro)

// __ Processos

nr_centenas = nr_inteiro / 100
nr_dezenas = (nr_inteiro % 100) / 10
nr_unidades = nr_inteiro % 10

// __ Saídas

imprimir (nr_centenas)
imprimir (nr_dezenas)
imprimir (nr_unidades)

*/

import java.util.Scanner;

public class Uni03Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Bem vindo ao programa de leitura de inteiros!");

        // __ Variáveis e Entradas
        System.out.println("Insira um número inteiro de até 3 dígitos:");
        int nr_inteiro = sc.nextInt();

        // __ Processos
        int nr_centenas = nr_inteiro / 100;
        int nr_dezenas = (nr_inteiro % 100) / 10;
        int nr_unidades = nr_inteiro % 10;

        // __ Saídas
        System.out.println(nr_centenas + " centena(s) " + nr_dezenas + " dezena(s) " + nr_unidades + " unidade(s)");

        sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
Número: 345
Resultado: 3 centenas 4 dezenas 5 unidades

__ Caso 2 __
Número: 128
Resultado: 1 centena 2 dezenas 8 unidades
*/