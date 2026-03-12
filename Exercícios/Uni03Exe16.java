/*

// __ Enunciado:

Faça um programa que calcule o troco de uma compra utilizando o menor número 
possível de notas de 100, 10 e 1 real.

// __ Análise : OK

faça um programa
utilizando

// __ Entradas

ler (vl_compra)
ler (vl_recebido)

// __ Processos

vl_troco = vl_recebido - vl_compra
nr_notas_100 = vl_troco / 100
nr_notas_10 = (vl_troco % 100) / 10
nr_notas_1 = vl_troco % 10
nr_notas_total = nr_notas_100 + nr_notas_10 + nr_notas_1

// __ Saídas

imprimir (nr_notas_total)
imprimir (nr_notas_100)
imprimir (nr_notas_10)
imprimir (nr_notas_1)

*/

import java.util.Scanner;

public class Uni03Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Bem vindo ao programa de troco!");
        System.out.println("Notas disponíveis: \n--- 100 reais \n--- 10 reais \n--- 1 real");

        // __ Variáveis e Entradas
        System.out.println("Insira o valor da compra:");
        int vl_compra = sc.nextInt();

        System.out.println("Insira o valor recebido:");
        int vl_recebido = sc.nextInt();

        // __ Processos
        int vl_troco = vl_recebido - vl_compra;
        int nr_notas_100 = vl_troco / 100;
        int nr_notas_10 = (vl_troco % 100) / 10;
        int nr_notas_1 = vl_troco % 10;
        int nr_notas_total = nr_notas_100 + nr_notas_10 + nr_notas_1;

        // __ Saídas
        System.out.println("O número mínimo de notas de troco é: " + nr_notas_total);
        System.out.println("Quantida de notas de 100 necessárias: \n--- " + nr_notas_100 +
                "\nQuantidade de notas de 10 necessárias: \n--- " + nr_notas_10 +
                "\nQuantidade de notas de 1 necessárias: \n--- " + nr_notas_1 );

        sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
Compra: 135
Recebido: 200
Troco: 65
Número minimo de notas: 11
Notas de 100: 0
Notas de 10: 6
Notas de 1: 5

__ Caso 2 __
Compra: 80
Recebido: 150
Troco: 70
Número minimo de notas: 7
Notas de 100: 0
Notas de 10: 7
Notas de 1: 0
*/