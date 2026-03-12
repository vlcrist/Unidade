/*

// __ Enunciado:

Faça um programa que leia a distância percorrida por um carro e o tempo gasto 
na viagem. O programa deve calcular a velocidade média e a quantidade de combustível 
gasto, sabendo que o carro faz 12 km por litro.

// __ Análise : OK

faça um programa
sabendo que

// __ Entradas

ler (vl_distancia)
ler (vl_tempo)

// __ Processos

vl_velocidade = vl_distancia / vl_tempo
vl_combustivel = vl_distancia / 12

// __ Saídas

imprimir (vl_velocidade)
imprimir (vl_combustivel)

*/

import java.util.Scanner;

public class Uni03Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Bem vindo ao programa de cálculo de velocidade média e quantidade de combustível gasta!");

        // __ Variáveis e Entradas
        System.out.println("Primeiramente, insira a distância percorrida em km:");
        int vl_distancia = sc.nextInt();

        System.out.println("Agora, insira o tempo gasto em horas:");
        int vl_tempo = sc.nextInt();

        // __ Processos
        int vl_velocidade = vl_distancia / vl_tempo;
        double vl_combustivel = vl_distancia / 12.0;

        // __ Saídas
        System.out.println("A velocidade média foi de " + vl_velocidade + " km/h e a quantidade de combustível usado foi " + vl_combustivel + " litros.");

        sc.close();
    }    
}

/*
Valores de teste

__ Caso 1 __
Distância: 120
Tempo: 2
Velocidade: 60
Combustível: 10

__ Caso 2 __
Distância: 180
Tempo: 3
Velocidade: 60
Combustível: 15
*/