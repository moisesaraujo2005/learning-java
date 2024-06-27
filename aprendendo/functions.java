public class functions {
    public static void main(String[] args) {

    String nome = "moisés";
        saudacao(nome);
        int resultado = soma(2,3);
        System.out.printf("O resultado é %s", resultado);
    }

    public static void saudacao (String nomeParametro) {
        System.out.println("Hello, " + nomeParametro);
    }

    public static int soma (int a, int b) {
        return a+b;
    }
}
