/*

// __ Enunciado:

Faça um programa que converta uma temperatura em graus Celsius para Fahrenheit.

// __ Análise : OK

faça um programa
converta

// __ Entradas

ler (nr_celsius)

// __ Processos

nr_fahrenheit = (nr_celsius * 9/5) + 32

// __ Saídas

imprimir (nr_fahrenheit)

*/

import java.util.Scanner;

public class Uni03Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Bem vindo ao programa de conversão de temperaturas!");
        System.out.println("Edição graus Celsius para graus Fahrenheit");

        // __ Variáveis e Entradas
        System.out.println("Insira a temperatura (em °C):");
        double nr_celsius = sc.nextDouble();

        // __ Processos
        double nr_fahrenheit = (nr_celsius * 9/5) + 32;

        // __ Saídas
        System.out.printf("%.2f", nr_fahrenheit);

        sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
Celsius: 0
Fahrenheit: 32

__ Caso 2 __
Celsius: 25
Fahrenheit: 77
*/