

public class Zad1pD
{
    public static String repeat(String str,int n)
    {
        String wyraz = String.format("%0" + n + "d", 0).replace("0", str);
        return wyraz;
    }
}
