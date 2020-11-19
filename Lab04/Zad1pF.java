import java.util.ArrayList;

import static java.lang.Character.isLowerCase;

public class Zad1pF {
    static String countSubStr(String str) {
        ArrayList<Character> arry2 = new ArrayList<Character>();
        char[] array = str.toCharArray();
        char x = ' ';
        char y = ' ';

        for (int i = 0; i < array.length; i++) {
            if (Character.isLowerCase(array[i])) {
                x = Character.toUpperCase(array[i]);
                arry2.add(x);
            } else if (Character.isUpperCase(array[i])) {
                y = Character.toLowerCase(array[i]);
                arry2.add(y);
            } else if (Character.isSpace(array[i])) {
                arry2.add(array[i]);
            }
        }
        StringBuilder result = new StringBuilder(arry2.size());
        for (Character c : arry2) {
            result.append(c);
        }
        String output = result.toString();

        return output;
    }
}

