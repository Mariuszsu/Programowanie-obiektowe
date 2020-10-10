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
        System.out.println("\nPodwojona suma podanych licz wynosi:");
        int wynik = 0;
        for (int i=0;i<n;i++)
        {
            if(ciag[i]>0)
            {
                wynik +=ciag[i];
            }
        }
        System.out.print(wynik*2);
    }
}
