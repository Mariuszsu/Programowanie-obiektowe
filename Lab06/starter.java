import javax.print.DocFlavor;
import java.util.Scanner;

public class starter
{
    public static void main(String[] args) {
        RachunekBankowy rachunek1 = new RachunekBankowy(2000);
        RachunekBankowy.setRocznaStopaProcentowa(5);
        System.out.println(RachunekBankowy.rocznaStopaProcentowa);
        System.out.println(rachunek1.obliczMiesieczneOdsetki());

        RachunekBankowy rachunek2 = new RachunekBankowy(3000);
        System.out.println(rachunek2.obliczMiesieczneOdsetki());
    }
}
