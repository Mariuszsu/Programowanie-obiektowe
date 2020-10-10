import java.util.Scanner;

public class PodpunktF
{
    public PodpunktF(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        int n = scan.nextInt();
        System.out.println("Podałeś liczbę " + n);
        System.out.printf("Podaj %d liczb rzeczywistych", n);
        System.out.println();
        double suma = 0;
        for(int a=1; a<=n; a++){
            suma += Math.pow(scan.nextDouble(),2);
        }
        System.out.printf("Suma potęg liczb to %.2f", suma);
    }
}
