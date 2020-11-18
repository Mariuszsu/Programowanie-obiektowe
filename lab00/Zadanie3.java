public class Zadanie3
{
    public static void main(String[] args) {
        System.out.println("Iloczyn pierwszych dziesięciu liczb całkowitych dodatnich:");
        int Iloczyn = 1;
        int a = 0;
        for(a=1;a<=10;a++)
        {
            Iloczyn = Iloczyn * a;

        }
        System.out.print(Iloczyn);
    }
}
