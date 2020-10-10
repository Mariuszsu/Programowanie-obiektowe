import java.util.Scanner;
class PodpunktB
{
    public PodpunktB(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        int n = scan.nextInt();
        System.out.println("Podałeś liczbę " + n);
        System.out.printf("Podaj %d liczb rzeczywistych", n);
        System.out.println();
        double iloczyn = 1;
        for(int a=1; a<=n; a++){
            iloczyn *= scan.nextDouble();
        }
        System.out.printf("ILoczyn liczb to %.2f", iloczyn);
    }
}
