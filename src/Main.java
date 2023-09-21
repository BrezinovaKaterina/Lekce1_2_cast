import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String name="Jana Nová";
        LocalDate datNar= LocalDate.of(2000,1,6);
        String mesto="Tábor";
        String SPZ="7A7 7777";
        Double spotreba=(5.3);
        String IP="192.168.48.39";
        int contractId;
        int total;
        int prodejPrumer;
        contractId=4;
        total=24;
        prodejPrumer=total/contractId;
        System.out.println("Průměrné množství prodané mrkve je " +prodejPrumer+ " ks.");
    }
}

