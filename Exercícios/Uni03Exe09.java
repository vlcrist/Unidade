/*

// __ Enunciado:

Faça um programa que calcule o volume de uma lata de óleo.
O programa deve ler o raio da base e a altura da lata.

// __ Análise : OK

faça um programa
o programa deve ler

// __ Entradas

ler (vl_raio)
ler (vl_altura)

// __ Processos

vl_volume_lata = vl_pi * (vl_raio ^ 2) * vl_altura

// __ Saídas

imprimir (vl_volume_lata)

*/

import java.util.Scanner;

public class Uni03Exe09 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // __ Variáveis
    double vl_pi = 3.14159265358979;

    // __ Saídas
    System.out.println("Bem vindo ao programa de cálculo de volume de uma lata de óleo");

    // __ Variáveis e Entradas
    System.out.println("Insira o valor do raio");
    double vl_raio = sc.nextDouble();

    System.out.println("Agora, insira o valor da altura:");
    double vl_altura = sc.nextDouble();

    // __ Processos
    double vl_volume_lata = vl_pi * Math.pow(vl_raio, 2) * vl_altura;
    String vl_volume_format = String.format("%.2f", vl_volume_lata);

    // __ Saídas
    System.out.println("O volume da lata de óleo é: " + vl_volume_format);

    sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
Raio: 3
Altura: 10
Volume: 282.74

__ Caso 2 __
Raio: 5
Altura: 8
Volume: 628.32
*/
