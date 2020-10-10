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
         System.out.println("Wprowadzony ciąg:");
         for (int i=0;i<n;i++)
         {
             System.out.print(ciag[i]+",");
         }
         System.out.println("\nCiąg po zmianie:");

         for (int i=1;i<n;i++)
         {
             System.out.print(ciag[i]+",");
         }
         System.out.print(ciag[0]);
     }
}
