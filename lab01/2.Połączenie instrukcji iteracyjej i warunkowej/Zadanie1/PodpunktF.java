import java.util.Scanner;
class PodpunktF
{
    public PodpunktF()
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
        System.out.println("\nIlosć liczb które mają nieparzysty numer (numerujemy od 1 do n) i są liczbami parzystymi:");
        int licz = 0;
        for (int i=0;i<n;i++)
        {
            if(ciag[i]%2==0&&i%2==0)
            {   System.out.print(ciag[i]);
                licz = licz + 1;
            }
        }
        System.out.print(licz);
    }
}
