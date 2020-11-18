import java.util.ArrayList;

public class Zadanie2
{
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        int dlugosc_a = a.toArray().length;
        int dlugosc_b = b.toArray().length;
        ArrayList<Integer> nowa_lista = new ArrayList<Integer>();
        int i,j = 0;
        i = Math.min(dlugosc_a,dlugosc_b);
        for (int n=0;n<i;n++)
        {
            nowa_lista.add(a.get(j));
            nowa_lista.add(b.get(j));
            j++;
        }
        if(dlugosc_a<dlugosc_b)
        {
            for (int n=0;n<Math.abs(dlugosc_a-dlugosc_b);n++)
            {
                nowa_lista.add(b.get(j+n));
            }
        }
        else
        {
            for (int n=0;n<Math.abs(dlugosc_a-dlugosc_b);n++)
            {
                nowa_lista.add(a.get(j+n));
            }
        }
        return nowa_lista;
    }

}
