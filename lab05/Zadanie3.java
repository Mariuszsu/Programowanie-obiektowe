import java.util.ArrayList;

class Zadanie3
{
    public static ArrayList<Integer> merge2(ArrayList<Integer> a, ArrayList<Integer> b) {
        // a gdyby użyć dwóch zmiennych i przypisać do nich dłuższą i krótszą listę
        // trzeba jeszcze wziąć pod uwagę, że mogą być równoliczne
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        ArrayList<Integer> shorter;
        ArrayList<Integer> longer;

        if(a.size() < b.size() || a.size() == b.size()){
            shorter = a;
            longer = b;
        }
        else {
            shorter = b;
            longer = a;
        }
        // dalej od Pana fragment kodu
        int lastIndex = 0;
        for(;lastIndex < shorter.size();lastIndex++){
            finalList.add(a.get(lastIndex));
            finalList.add(b.get(lastIndex));
        }
        // i dodajemy to co zostało z listy dłuższej
        System.out.println(finalList);
        finalList.addAll(lastIndex-1, longer);
//        System.out.println(longer.get(lastIndex));
        System.out.println(longer.get(lastIndex-1));
        return finalList;
    }
}
