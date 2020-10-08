import java.util.Scanner;

class PodpunktF
{
    public PodpunktF()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Prosze podać liczbe naturalna n:");
        int liczba = in.nextInt();
        int suma =0;
        for (int i=0;i<=liczba;i++)
        {
            suma=suma+i*i;
        }
        System.out.print(suma);
    }
}
