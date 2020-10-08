import java.util.Scanner;

class PodpunktG
{
    public PodpunktG()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Prosze podać liczbe naturalna n:");
        int liczba = in.nextInt();
        int suma =0;
        int iloczyn = 1;
        for (int i=1;i<=liczba;i++)
        {
            suma=suma+i;
            iloczyn=iloczyn*i;
        }
        System.out.print("Wartość sumy:" + suma +"\n");
        System.out.print("Wartość iloczynu:" + iloczyn);
    }
}
