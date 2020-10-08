import java.util.Scanner;

class PodpunktD
{
    public PodpunktD()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Prosze podać liczbe naturalna n:");
        int liczba = in.nextInt();
        double suma =0;
        for (double i=0;i<=liczba;i++)
        {
            suma=suma+Math.sqrt(i);
        }
        System.out.print(suma);
    }
}
