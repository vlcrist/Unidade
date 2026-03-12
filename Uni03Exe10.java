/*

// __ Enunciado:

Faça um programa que calcule a hipotenusa de um triângulo retângulo
lendo os valores dos dois catetos.

// __ Análise : OK

faça um programa
lendo os valores

// __ Entradas

ler (vl_co)
ler (vl_ca)

// __ Processos

vl_h = sqrt((vl_ca ^ 2) + (vl_co ^ 2))

// __ Saídas

imprimir (vl_h)

*/

import java.util.Scanner;

public class Uni03Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Bem vindo ao sistema de cálculo da hipotenusa em triângulos retângulos");

        // __ Variáveis e Entradas
        System.out.println("Insira o valor do cateto oposto:");
        double vl_co = sc.nextDouble();

        System.out.println("Insira o valor do cateto adjacente:");
        double vl_ca = sc.nextDouble();

        // __ Processos
        double vl_h = Math.sqrt(Math.pow(vl_ca,2) + Math.pow(vl_co, 2));

        // __ Saídas
        System.out.printf("A hipotenusa é: %.2f", vl_h);

        sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
CO: 3
CA: 4
Hipotenusa: 5

__ Caso 2 __
CO: 5
CA: 12
Hipotenusa: 13
*/