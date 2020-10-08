import java.util.Scanner;

 class PodpunktC
{
    public PodpunktC()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Prosze podać liczbe naturalna n:");
        int liczba = in.nextInt();
        int suma =0;
        for (int i=0;i<=liczba;i++)
        {
            suma=suma+Math.abs(i);
        }
        System.out.print(suma);
    }
}
