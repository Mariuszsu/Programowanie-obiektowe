import java.util.ArrayList;
public class Zad1pA
{
    public static int countChar(String str, char c)
    {
        int ilosc = 0;
        char znak;

        c = String.valueOf(c).toUpperCase().charAt(0);
        for (int i = 0 ; i < str.length() ; i++)
        {
            znak = str.charAt(i);
            znak = String.valueOf(znak).toUpperCase().charAt(0);
            if(znak == c)
            {
                ilosc++;
            }
        }
        return ilosc;
    }
}
