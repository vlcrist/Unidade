import java.util.Scanner;

public class Uni03Uri1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double r = sc.nextDouble();
        double A = (Math.pow(r, 2) * n);

        System.out.printf("A= %.4f%n", A);
        sc.close();
    }   
}
