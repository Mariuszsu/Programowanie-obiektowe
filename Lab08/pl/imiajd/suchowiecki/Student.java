package pl.imiajd.suchowiecki;
import java.time.LocalDate;

class Student extends Osoba
{
    private String kierunek;
    private double sredniaOcen;

    public Student(String nazwisko, String[] imiona, LocalDate dataUroddzenia, boolean płeć,String kierunek,double sredniaOcen)
    {
        super(nazwisko, imiona, dataUroddzenia, płeć);
        this.kierunek = kierunek;
        this.sredniaOcen=sredniaOcen;
    }

    public String getOpis()
    {
        return " kierunek studiów: " + kierunek +" ze srednia ocen " + sredniaOcen;
    }

    public String getKierunek() {
        return kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }
}