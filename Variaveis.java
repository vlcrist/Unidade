/**
 * @author Victor Cristofolini
 * @version 1.0
 *          Aula de Introdução à programação
 */

public class Variaveis {

    public static void main(String[] args) {
        // Inteiros
        byte nrPequeno = 123; // -128 a 127
        Short nrShort = 12323; // -32767 a 32767
        int nrInt = 123123;// -2147483648 a 2147483648
        long nrLong = 12312313234343l; // -9223372036854775808 a 9223372036854775807

        System.out.println(nrPequeno);
        System.out.println(nrShort);
        System.out.println(nrInt);
        System.out.println(nrLong);

        // Ponto flutuante
        float nrFloat = 4.5f;
        double nrDouble = 0.5556; // Média do Jão no primeiro semestre da faculdade;

        System.out.println(nrFloat);
        System.out.println(nrDouble);

        // variavel do tipo caracter
        char letra = 'C';

        // variavel do tipo falso e verdadeiro
        boolean estouComFome = true;

        System.out.println(letra);
        System.out.println(estouComFome);

        // Classe String para textos
        String texto = "texto";
        System.out.println(texto);
    }
}
