import java.util.Scanner;

public class Uni03Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de cálculo de salário líquido e bruto");
        int vl_por_horas = 10;
        double ds_descontos = (100 - 13.5) / 100;

        System.out.println("Nome do funcionário: ");
        String nm_funcionario = sc.next();

        System.out.println("Número de horas trabalhadas: ");
        int nr_horas_trabalhadas = sc.nextInt();

        System.out.println("Número de dependentes:");
        int nr_dependentes = sc.nextInt();

        double vl_salario_trabalho = ((nr_horas_trabalhadas * vl_por_horas)  * ds_descontos);
        double vl_salario_depedentes = (nr_dependentes * 60);
        double vl_salario_liquido = vl_salario_depedentes + vl_salario_trabalho;
        double vl_salario_bruto = (nr_horas_trabalhadas * vl_por_horas) + (nr_dependentes * 60);

        System.out.println("O funcionário " + nm_funcionario + " possui um salário bruto de R$" + vl_salario_bruto + " e um salário líquido de R$" + vl_salario_liquido);
        sc.close();
    }
}
