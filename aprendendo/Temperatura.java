public class Temperatura {
    public static void main(String[] args) {

        double tempSP = 13.3;
        double tempRS = 4.5;



        double fahrenheitSP = (tempSP*1.8) + 32;
        double fahrenheitRS = (tempRS*1.8) +32;

        int conversaoSP = (int) fahrenheitSP;
        int conversaoRS = (int) fahrenheitRS;
        String mensagem = "A temperatura em SP agora é " + tempSP + " A temperatura no RS agora " +
                "é "+ tempRS + " Mas convertido em Fahrenheits, a temperatura de SP é " +
                "" + conversaoSP + " E no RS é " + conversaoRS;

        System.out.println(mensagem);


    }
}
