/*

// __ Enunciado:

Faça um programa que leia um valor em dólares e converta para reais, 
utilizando a cotação do dólar igual a 5.65.

// __ Análise : OK

faça um programa
utilizando

// __ Entradas

ler (vl_dolar)

// __ Processos

vl_reais = vl_dolar * vl_cotacao

// __ Saídas

imprimir (vl_reais)

*/

import java.util.Scanner;

public class Uni03Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Bem vindo ao programa de câmbio de dólares para reais");
        System.out.println("O valor do dólar na cotação é de 5.65");

        // __ Variáveis e Entradas
        System.out.println("Insira a quantidade dólares:");
        double vl_dolar = sc.nextDouble();
        double vl_cotacao = 5.65;

        // __ Processos
        double vl_reais = vl_dolar * vl_cotacao;

        // __ Saídas
        System.out.println("O atendente deve devolver R$" + vl_reais + " para o cliente");

        sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
Dólares: 10
Reais: 56.5

__ Caso 2 __
Dólares: 50
Reais: 282.5
*/