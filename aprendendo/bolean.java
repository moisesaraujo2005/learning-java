public class bolean {

    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        boolean gasolina = true;
        boolean vontade = false ;
        boolean vai = gasolina || vontade;
        // Tabela verdade;
        // Operador && (AND) true && true = true;
        // Operador || (OR) true || false = true;

        String mensagem =fimDeSemana ? "É fim de semana" : "Não é fim de semana";   ;


        System.out.println(mensagem);
        System.out.println((vai));

    }
}