import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uni03Uri1001 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // __ Variáveis:
        int A;
        int B;
        int X;

        // __ Entradas:
        A = sc.nextInt();
        B = sc.nextInt();

        //__ Processos:
        X = A + B;

        // __ Saídas:
        System.out.println("X = " + X);

    }
 
}