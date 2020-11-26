package pl.imiajd.suchowiecki;

public class Student extends Osoba {
    public Student(String nazwisko, int rokUrodzenia,String kierunek)
    {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }
    public String kierunek;
    public String toString()
    {
        return kierunek;
    }
    public String getKierunek(){return kierunek;}
}
