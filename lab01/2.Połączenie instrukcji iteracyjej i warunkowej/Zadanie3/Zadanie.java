import java.util.Scanner;

class Zadanie
{
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
       
        int licznikdodatnich = 0;
        int licznikujemnych = 0;
        int liczbazer = 0;
        for (int i=0;i<n;i++)
        {
            if(ciag[i]>0)
            {
                licznikdodatnich +=1;
            }
            if (ciag[i]<0)
            {
                licznikujemnych +=1;
            }
            if (ciag[i]==0)
            {
                liczbazer +=1;
            }
        }
        System.out.println("Ilość liczb dodatnich wynosi: " + licznikdodatnich);
        System.out.println("Ilość liczb ujemnych wynosi: " + licznikujemnych);
        System.out.println("Ilosć zer wynosi: " + liczbazer);
    }
}
