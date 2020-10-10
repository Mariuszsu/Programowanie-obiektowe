import java.util.Scanner;
class PodpunktA
{
    public PodpunktA(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");
        int n = scan.nextInt();
        System.out.println("Podałeś liczbę " + n);
        System.out.printf("Podaj %d liczb rzeczywistych", n);
        System.out.println();
        double suma = 0;
        for(int a=1; a<=n; a++){
            suma += scan.nextDouble();
        }
        System.out.printf("Suma liczb to %.2f", suma);
    }
}