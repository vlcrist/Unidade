/*

// __ Enunciado:

Uma lanchonete vende refrigerantes em três tamanhos: 350 ml, 600 ml e 2 litros. 
Faça um programa que leia a quantidade comprada de cada tamanho e calcule 
a quantidade total de litros adquiridos pelo cliente.

// __ Análise : OK

Uma lanchonete vende
faça um programa que
pelo cliente

// __ Entradas

ler (nr_350ml)
ler (nr_600ml)
ler (nr_2l)

// __ Processos

vl_litros_totais = ((nr_350ml * 350) / 1000) + ((nr_600ml * 600) / 1000) + (nr_2l * 2)

// __ Saídas

imprimir (vl_litros_totais)

*/

import java.util.Scanner;

public class Uni03Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Bem vindo ao programa de orçamento de livros de refrigerante!");
        System.out.println("Dísponivel em 3 quantidades: \n350ml\n600ml\n2L");

        // __ Variáveis e Entradas
        System.out.println("Primeiro insira a quantidade de refrigerantes de 350ml:");
        double nr_350ml = sc.nextDouble();

        System.out.println("Agora insira a quantidade de refrigerantes de 600ml:");
        double nr_600ml = sc.nextDouble();

        System.out.println("Por fim, insira a quantidade de refrigerantes de 2L:");
        double nr_2l = sc.nextDouble();

        // __ Processos
        double vl_litros_totais = ((nr_350ml * 350) / 1000) + ((nr_600ml * 600)/ 1000) + nr_2l * 2;

        // __ Saídas
        System.out.println("O cliente comprou ao total " + vl_litros_totais + " litros");

        sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
350ml: 2
600ml: 1
2L: 1
Total: 3.3 litros

__ Caso 2 __
350ml: 0
600ml: 3
2L: 2
Total: 5.8 litros
*/