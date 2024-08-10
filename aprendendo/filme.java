public class filme {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        int exemplo;
        exemplo = 20;
        System.out.println("Ano de lançamento " + anoDeLancamento + " Faz " + exemplo + " anos de lançamento se o ano for 2042" +
                " ");

        boolean incluidoNoPlano = false;
        double nota = 9.9;

        double media = (9.8+6.3)/2;
        // Média calculada pelas duas nota do Moisés e Salomão
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento 
                """ + anoDeLancamento;
        System.out.println(sinopse);
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.8f reais", nome, idade, valor));
        String nome2 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, aulas);

        System.out.println(mensagem);
        int classificacao;
        classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}
