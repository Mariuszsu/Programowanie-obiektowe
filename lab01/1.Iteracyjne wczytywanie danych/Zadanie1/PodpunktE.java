import java.util.Scanner;

public class PodpunktE
{
    public PodpunktE(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        int n = scan.nextInt();
        System.out.println("Podałeś liczbę " + n);
        System.out.printf("Podaj %d liczb rzeczywistych", n);
        System.out.println();
        double iloczyn = 1;
        for(int a=1; a<=n; a++){
            iloczyn *= Math.abs(scan.nextDouble());
        }
        System.out.printf("Iloczyn liczb to %.2f", iloczyn);
    }
}
