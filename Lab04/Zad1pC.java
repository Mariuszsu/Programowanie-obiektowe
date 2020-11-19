public class Zad1pC
{
    public static String middle(String str)
    {
        int pozycja;
        int dlugosc;
        if (str.length() % 2 == 0)
        {
            pozycja = str.length() / 2 - 1;
            dlugosc = 2;
        }
        else
        {
            pozycja = str.length() / 2;
            dlugosc = 1;
        }
        return str.substring(pozycja, pozycja + dlugosc);
    }

}
