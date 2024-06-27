import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 3;
        numeros[2] = 5;
        numeros[3] = 7;
        numeros[4] = 8;
        int tamanhoLista = numeros.length;
        int soma = 0;
        int maiorNumero = numeros[0];
        int menorNumeros = numeros[0];
        for (int i = 0; i < tamanhoLista; i++) {
            int element = numeros[i];
            if (element > maiorNumero) {
                maiorNumero = element;
            }
            if (element < menorNumeros) {
                menorNumeros = element;
            }

            soma += element;
        }

        float média = (float) soma / tamanhoLista;
        System.out.printf("A soma dos elementos é %s, a média dos números são %s, o maior número é %s e o menor número é %s %n", soma, média, maiorNumero, menorNumeros);

        String[] letras = {"A", "B", "C", "J", "X"};

        for (int i = 0; i < letras.length; i++) {

            System.out.println(letras[i]);

        }

        System.out.println(Arrays.toString((letras)));


    }
}
