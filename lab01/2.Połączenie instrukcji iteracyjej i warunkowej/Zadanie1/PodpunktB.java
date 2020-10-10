import java.util.Scanner;
class PodpunktB
{
    public PodpunktB()
    {
        double[] ciag;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        int n = scan.nextInt();
        System.out.println("Podałeś liczbę " + n);
        System.out.printf("Podaj %d liczb rzeczywistych", n);
        System.out.println();
        ciag=new double[n];
        for(int i=0; i<n; i++){
            ciag[i]=scan.nextDouble();
        }
        System.out.println("Wczytane liczby:");
        for (int i=0;i<n;i++)
        {
            System.out.print(ciag[i]+",");
        }
        System.out.println("\nIlosc liczb podzielnych przez 3 i niepodzielne przez 5:");
        int licz = 0;
        for (int i=0;i<n;i++)
        {
            if((ciag[i]%3)==0&&(ciag[i]%5)!=0)
            {
                    licz = licz + 1;
            }
        }
        System.out.print(licz);
    }
}
