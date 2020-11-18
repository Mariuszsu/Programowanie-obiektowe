import java.util.ArrayList;
import java.util.Arrays;
public class Starter
{
    public static void main(String[] args) {
        ArrayList<Integer> Pierwsza_lista= new ArrayList<Integer>(Arrays.asList(1,4,9,16));
        ArrayList<Integer> Druga_lista= new ArrayList<Integer>(Arrays.asList(9,7,4,9,11));

        System.out.println("Zadaine 1");
        System.out.println(Zadanie1.append(Pierwsza_lista,Druga_lista));
        System.out.println("Zadaine 2");
        System.out.println(Zadanie2.merge(Pierwsza_lista,Druga_lista));
        System.out.println("Zadaine 3");
        System.out.println(Zadanie3.merge2(Pierwsza_lista,Druga_lista));
        System.out.println("Zadaine 4");
        System.out.println(Zadanie4.reversed(Pierwsza_lista));
        reverse(Pierwsza_lista);

    }
    static void reverse(ArrayList<Integer> array)
    {
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

}
