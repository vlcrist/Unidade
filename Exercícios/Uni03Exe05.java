/*

// __ Enunciado:

Uma granja possui um controle automatizado de cada frango da sua produção. 
No pé direito do frango há um anel com um chip de identificação; 
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa 
para calcular o gasto total da granja para marcar todos os seus frangos.

// __ Análise : OK

Uma granja possui um controle automatizado de da sua produção
No pé direito do frango há no pé esquerdo são Sabendo que o
faça um programa para

// __ Entradas

ler (nr_galinacios) ler (vl_chip) ler(vl_alimento)

// __ Processos

vl_per_galinea = vl_chip + vl_alimento
vl_orcamento = nr_galinacios * vl_per_galinea


// __ Saídas

imprimir (nr_galinacios) imprimir (vl_orcamento)


*/


import java.util.Scanner;

public class Uni03Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de orçamento de gasto da granja!");
        
        // __ Variáveis e Entradas:
        System.out.println("Insira o número de frangos para prosseguir com o programa");
        int nr_galinacios = sc.nextInt();
        double vl_chip = 4.0;
        double vl_alimento = 3.5 * 2; // "* 2" por que são dois por frango

        /* Poderia ter apenas somado tudo fora do java, 
        fazendo com que o "vl_per_galinea" fosse fixo e 
        sem cálculos intermediários, mas prefiro separar para
        compreender e identificar melhor */

        // __ Processos:
        double vl_per_galinea = vl_chip + vl_alimento;
        double vl_orcamento = nr_galinacios * vl_per_galinea;
        String vl_orcamento_format = String.format("R$" + vl_orcamento);

        // __ Saídas:
        System.out.println("O gasto total para marcar " + nr_galinacios + " é " + vl_orcamento_format);
        sc.close();
    }
}

/*
Valores de teste
__ Caso 1 __
Número de galinhas: 100.0
Gasto para marcar: 1100.0

__ Caso 2 __
Número de galinhas: 3500.00
Gasto para marcar: 38500.0
*/