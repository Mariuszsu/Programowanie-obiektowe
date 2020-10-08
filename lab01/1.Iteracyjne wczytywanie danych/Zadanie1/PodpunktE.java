import java.util.Scanner;

class PodpunktE
{
    public PodpunktE()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Prosze podać liczbe naturalna n:");
        int liczba = in.nextInt();
        int iloczyn =1;
        for (int i=1;i<=liczba;i++)
        {
            iloczyn=iloczyn*Math.abs(i);
        }
        System.out.print(iloczyn);
    }
}
