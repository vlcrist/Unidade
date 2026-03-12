/*

// __ Enunciado:

Uma empresa paga R$10 por hora trabalhada e R$60 por dependente.
Sobre o salário referente às horas trabalhadas há desconto de 13.5%.
Faça um programa que leia o nome do funcionário, horas trabalhadas
e número de dependentes e calcule o salário bruto e líquido.

// __ Análise : OK

uma empresa paga
faça um programa que

// __ Entradas

ler (nm_funcionario)
ler (nr_horas_trabalhadas)
ler (nr_dependentes)

// __ Processos

vl_salario_trabalho = ((nr_horas_trabalhadas * vl_por_horas) * ds_descontos)
vl_salario_dependentes = nr_dependentes * 60
vl_salario_liquido = vl_salario_dependentes + vl_salario_trabalho
vl_salario_bruto = (nr_horas_trabalhadas * vl_por_horas) + (nr_dependentes * 60)

// __ Saídas

imprimir (vl_salario_bruto)
imprimir (vl_salario_liquido)

*/

import java.util.Scanner;

public class Uni03Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __ Saídas
        System.out.println("Programa de cálculo de salário líquido e bruto");

        // __ Variáveis
        int vl_por_horas = 10;
        double ds_descontos = (100 - 13.5) / 100;

        // __ Variáveis e Entradas
        System.out.println("Nome do funcionário: ");
        String nm_funcionario = sc.next();

        System.out.println("Número de horas trabalhadas: ");
        int nr_horas_trabalhadas = sc.nextInt();

        System.out.println("Número de dependentes:");
        int nr_dependentes = sc.nextInt();

        // __ Processos
        double vl_salario_trabalho = ((nr_horas_trabalhadas * vl_por_horas)  * ds_descontos);
        double vl_salario_depedentes = (nr_dependentes * 60);
        double vl_salario_liquido = vl_salario_depedentes + vl_salario_trabalho;
        double vl_salario_bruto = (nr_horas_trabalhadas * vl_por_horas) + (nr_dependentes * 60);

        // __ Saídas
        System.out.println("O funcionário " + nm_funcionario + " possui um salário bruto de R$" + vl_salario_bruto + " e um salário líquido de R$" + vl_salario_liquido);

        sc.close();
    }
}

/*
Valores de teste

__ Caso 1 __
Nome do funcionário: Victor
Horas: 100
Dependentes: 2
Bruto: 1120
Líquido: 985

__ Caso 2 __
Nome do funcionário: Everton
Horas: 80
Dependentes: 1
Bruto: 860
Líquido: 752
*/