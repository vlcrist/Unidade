/*

// __ Enunciado:

Uma parede será revestida com azulejos. São necessários 9 azulejos para cada metro quadrado 
e cada azulejo custa R$12,50. Faça um programa que leia a altura e o comprimento da parede 
e calcule o gasto total com os azulejos.

// __ Análise : OK

Uma parede será revestida
são necessários
faça um programa que

// __ Entradas

ler (vl_altura)
ler (vl_comprimento)

// __ Processos

vl_area = vl_altura * vl_comprimento
vl_gasto = vl_area * nr_azulejos_por_metro * vl_azulejo

// __ Saídas

imprimir (vl_gasto)

*/

import java.util.Scanner;

public class Uni03Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Bem vindo ao programa de cálculo de gasto em azulejos!!");
        System.out.println("O valor da azulejo é de R$ 12,50 e vão 9 azulejos por metro quadrado");

        // __ Variáveis
        double vl_azulejo = 12.50;
        int nr_azulejos_por_metro = 9;

        // __ Variáveis e Entradas
        System.out.println("Insira a altura da parede:");
        int vl_altura = sc.nextInt();

        System.out.println("Agora insira o valor do comprimento da parede:");
        int vl_comprimento = sc.nextInt();

        // __ Processos
        double vl_area = vl_altura * vl_comprimento;
        double vl_gasto = vl_area * nr_azulejos_por_metro * vl_azulejo;

        // __ Saídas
        System.out.println("O gasto final é de R$" + vl_gasto);

        sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
Altura: 3
Comprimento: 4
Gasto: 1350

__ Caso 2 __
Altura: 2
Comprimento: 5
Gasto: 1125
*/