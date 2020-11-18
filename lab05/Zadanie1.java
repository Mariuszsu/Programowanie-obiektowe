import java.util.ArrayList;

class Zadanie1
{
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> nowa_lista = new ArrayList<Integer>();
        nowa_lista.addAll(a);
        nowa_lista.addAll(b);

        return nowa_lista;
    }

}