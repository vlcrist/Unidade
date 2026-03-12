/*

// __ Enunciado:

Em um restaurante por quilo, o cliente paga R$25,00 por quilograma do prato servido. 
Sabendo que o peso do prato vazio é de 750 gramas, faça um programa que leia o peso total 
do prato (com comida) em quilogramas e calcule o valor a ser pago pelo cliente.

// __ Análise : OK

Em um restaurante
o cliente paga
sabendo que
faça um programa que

// __ Entradas

ler (vl_peso_kilos)

// __ Processos

vl_peso_gramas = (vl_peso_kilos * 1000) - 750
vl_peso_final = (vl_peso_gramas / 1000) * vl_per_kilo

// __ Saídas

imprimir (vl_peso_final)

*/

import java.util.Scanner;

public class Uni03Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Bem vindo ao programa de cálculo de custo de prato no buffet!");
        System.out.println("SOMENTE R$25,00 POR KILO");

        // __ Variáveis e Entradas
        System.err.println("Insira o valor da pesagem (em kilos): ");
        double vl_peso_kilos = sc.nextDouble();
        int vl_per_kilo = 25;

        // __ Processos
        double vl_peso_gramas = (vl_peso_kilos * 1000) - 750;
        double vl_peso_final = (vl_peso_gramas / 1000) * vl_per_kilo;

        // __ Saídas
        System.err.println("O valor do prato do cliente é R$" + vl_peso_final);

        sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
Peso total: 1.2
Valor: 11.25

__ Caso 2 __
Peso total: 1.5
Valor: 18.75
*/