public class EstruturaCondicional {

    public static void main(String[] args) {

        int nota = 40;
       String mensagem = nota > 60 ? "Aluno aprovado" : "Aluno reprovado";

       int nota2 = 50;


       System.out.println(mensagem);


       switch (mensagem) {
           case "Aluno aprovado":
               System.out.println("Parábens!");
             break;
           case "Aluno reprovado":
               System.out.println("Tente novamente!");
                break;
           default :

               System.out.println("Erro desconhecido!");
               break;
           }

    }
}
