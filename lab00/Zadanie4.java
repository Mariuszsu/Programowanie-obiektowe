public class Zadanie4
{
    public static void main(String[] args) {
        System.out.println("Program, który drukuje saldo konta po pierwszym, drugim i trzecim roku. ");
        double stan_konta = 1000;

        for(int a=1;a<=3;a++)
        {
            stan_konta = stan_konta + stan_konta * 0.06;
            System.out.printf("W "+ a + " roku stan konta wynosi: %.2f \n",stan_konta );
        }
    }
}
