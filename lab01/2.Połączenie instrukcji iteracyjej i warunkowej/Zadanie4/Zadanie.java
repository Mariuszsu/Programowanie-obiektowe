import java.util.Scanner;
class Zadanie {
    public Zadanie()
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
        for (int i=0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if (ciag[i]>ciag[j])
                {
                    double pomocnicza = ciag[i];
                    ciag[i] = ciag[j];
                    ciag[j] = pomocnicza;
                }
            }
        }
        System.out.println("Najmniejsza podana liczba wynosi: " + ciag[0]);
        System.out.println("Najwieksza podana liczba wynosi:  " + ciag[n-1]);
    }
}
