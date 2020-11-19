import java.util.ArrayList;

public class Zad1pB {
    static int countSubStr(String str, String SubStr)
    {
        int napis = str.length();
        int napis2 = SubStr.length();
        if (napis == 0 || napis < napis2) {
            return 0;
        }
        if (str.substring(0, napis).equals(SubStr)) {
            return countSubStr(str.substring(napis2 - 1), SubStr) + 1;
        }
        return countSubStr(str.substring(napis - 1), SubStr);
    }
}

