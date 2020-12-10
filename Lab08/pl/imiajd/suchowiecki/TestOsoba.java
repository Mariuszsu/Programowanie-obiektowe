package pl.imiajd.suchowiecki;
import java.time.LocalDate;
import java.util.Stack;

public class TestOsoba
{
    public static void main(String[] args) {

        Pracownik pra1 = new Pracownik("Kowalski",new String[]{"Jan", "Mirek"}, LocalDate.of(1998,05,22),false,2100,LocalDate.of(2020,10,12));
        Student stu1 = new Student("Mickiewicz",new String[]{"Adm", "Juliusz"},LocalDate.of(1546,05,12), false, "Informatyk", 4);
        System.out.println(pra1.getImiona()+ pra1.getNazwisko()+ " Urodzony "+ pra1.getDataUroddzenia() + pra1);
        System.out.println((stu1.getImiona() + stu1.getNazwisko() + " urodzony " +stu1.getDataUroddzenia() + stu1.getOpis()));





    }
}
