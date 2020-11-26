package pl.imiajd.suchowiecki;

public class Nauczyciel extends Osoba{

    public Nauczyciel(String nazwisko, int rokUrodzenia,int pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    public int pensja;
    public String toString()
    {
        return String.valueOf(pensja);
    }
    public int getPensja(){return pensja;}
}
