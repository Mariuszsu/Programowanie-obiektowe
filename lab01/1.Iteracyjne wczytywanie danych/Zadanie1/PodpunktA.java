import java.util.Scanner;
class PodpunktA
{
    public PodpunktA()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Prosze podać liczbe naturalna n:");
        int liczba = in.nextInt();
        int suma =0;
        for (int i=0;i<=liczba;i++)
        {
            suma=suma+i;
        }
        System.out.print(suma);
    }
}
