/*

//__ Enunciado:

Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para ler o preço do litro da gasolina e o valor do 
pagamento e exibir quantos litros ele conseguiu colocar no tanque.


//__ Análise: OK 

Um motorista deseja abastecer seu tanque de combustível Escreva um programa para


//__ Entradas:

ler (vl_gasolina) ler (vl_pgto)


//__ Processos: 

nr_litros = vl_pgto / vl_gasolina;


//__ Saídas: número de litros 

imprimir(nr_litros)

*/




import java.util.Scanner;

public class Uni03Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // __Variáveis
        float vl_gasolina;
        float vl_pgto;


        System.out.println("Cálculo da gasolina!");

        // __Entradas
        System.out.println("Primeiramente, insira o valor da gasolina (em R$)!");
        vl_gasolina = sc.nextFloat();
        System.out.println("Insira o valor do pagamento para calcular.");
        vl_pgto = sc.nextFloat();


        // __Processos
        double nr_litros = vl_pgto / vl_gasolina;
        String nr_litrosC = String.format("%.2f", nr_litros);
        
        // __Saídas
        System.out.println("O motorista consegui colocar: " + nr_litrosC + " litros");
        sc.close();
    }
}

/*
Valores de teste
__ Caso 1 __
Valor da gasolina: 5.60
Valor do pagamento: 150
Número de litros: 26.79

__ Caso 2 __
Valor da gasolina: 3.00
Valor do pagamento: 120
Número de litros: 40.00
*/