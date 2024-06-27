import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;
public class manipulaçãoString {

    public static void main(String[] args) {
        //Olá, ${nome}. hoje é ${dia-da-semana}, BOM DIA. ;

        String nome = "Moisés";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

       String outroNome = "Moisés";
        System.out.println(nome.equalsIgnoreCase(outroNome));

        // ISO 8061
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale( "pt", "BR");


    String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
    String saudacao;
    LocalDateTime hora = LocalDateTime.now();

    if(hora.getHour() >= 0 && hora.getHour() <12) {
        saudacao = "bom dia";
    }

    else if(hora.getHour() >=12 && hora.getHour()<18) {
        saudacao = "boa tarde";
    }

    else {
        saudacao= "boa noite";
    }

        System.out.printf("Olá, %s. Hoje é %s, %s ", nome, diaSemana, saudacao.toUpperCase());

    }
}
