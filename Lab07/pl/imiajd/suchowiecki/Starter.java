package pl.imiajd.suchowiecki;
public class Starter
{
    public static void main(String[] args)
    {
        /*
        NazwanyPunkt a = new NazwanyPunkt(3, 5, "port");
        a.show();
        Punkt b = new Punkt(3, 5);
        b.show();
        Punkt c = new NazwanyPunkt(3, 6, "tawerna");
        c.show();
        a = (NazwanyPunkt) c;
        a.show();
*/
        Adres[] adresy = new Adres[2];

        adresy[0] = new Adres("Adama Mickiewicza", 75, "1", "Olsztyn", "10-334");
        adresy[1] = new Adres("Jana Pawła 2", 5 ,"Warszawa","01-934");

        for (Adres e : adresy) {
            System.out.println("Kod pocztowy i miasto: " + e.kod_pocztowy + "," + e.miasto);
            System.out.println("Adres, numer domu, numer mieszkania: " + e.ulica +" " + e.numer_domu +" "+e.numer_mieszkania);
        }
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Nauczyciel("Jan",1995,5000);
        ludzie[1] = new Student("Małgorzata",2010, "informatyka");
        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + " " + p.getRokUrodzenia() + " " + p.toString());
        }
    }
}
