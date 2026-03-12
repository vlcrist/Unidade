public class Escrever {
    public static void main(String[] args) {
        /* String nm_completo;
        nm_completo = "Victor Cristofolini";
        System.out.println(nm_completo);
        */
       String nm_filme = "Interestelar";
       int dt_lancamento = 2014;
       int nr_duracao = 169;
       float vl_nota = 8.5f;
       final char ds_inicial = 'I';
       boolean ds_sucesso = true;
    
       System.out.print("Segue a descrição: ");
       System.out.println("O filme " + nm_filme + " foi lançado em " + dt_lancamento + " com uma duração de " + nr_duracao + " minutos. \nSua nota do Imdb é " + vl_nota + " Sendo um dos maiores e mais aclamados filme da história.\nOu seja, seu sucesso foi " + ds_sucesso);

       // O filme <nm_filme> foi lançado em <dt_lancamento>, tem duração de <nr_duracao> minutos e nota de <vl_nota>
       System.out.format("O filme %s foi lançado em %d, tem duração de %d minutos e nota de %.1f", nm_filme, dt_lancamento, nr_duracao, vl_nota);
    
       String ds_msg1 = "Universidade";
       String ds_msg2 = "Blumenau";
       int ano = 1964;
       var ds_msg_final = ds_msg1 + " " + ds_msg2;
       
       System.out.format("\nA Fundação %s Regional de %s (FURB) foi fundada em %d", ds_msg1, ds_msg2, ano);
    
    }
}
