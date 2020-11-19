import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Starter
{
    public static void main(String[] args)
    {

        String napis = "Ala ma kota a kot ma ale";
        String napis1 = "ma";
        System.out.println(Zad1pA.countChar(napis, 'A'));
        System.out.println(Zad1pB.countSubStr(napis, napis1));
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wyraz: ");
        String wyraz = in.nextLine();
        Scanner in1 = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba = Integer.parseInt(in.nextLine());
        System.out.print("Srodkowy znak w wyrazie "+ wyraz + " to: " + Zad1pC.middle(wyraz)+"\n");
        System.out.println(Zad1pD.repeat(wyraz,liczba));

        System.out.println(Zad1pF.countSubStr("Zamiana DUZYCH LITER NA male i odwrotnie"));
    }


}
