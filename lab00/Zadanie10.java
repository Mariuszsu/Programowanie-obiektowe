import java.util.Scanner;
public class Zadanie10
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Wypisze trzy nazwiska:");
        System.out.println("2.Wypisze nazwy trzech filmów:");
        System.out.println("Co chcesz zrobić:");
        int wybor = in.nextInt();
        if(wybor==1)
        {
            System.out.println("Kowalski");
            System.out.println("Lewandowski");
            System.out.println("Nowak");
        }
        else {
            System.out.println("Incepcja");
            System.out.println("Leon Zawodowiec");
            System.out.println("Potop");
        }
    }
}
